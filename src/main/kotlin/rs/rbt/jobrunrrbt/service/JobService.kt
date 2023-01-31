package rs.rbt.jobrunrrbt.service

import rs.rbt.jobrunrrbt.helper.JobDTO
import rs.rbt.jobrunrrbt.helper.deserialize
import rs.rbt.jobrunrrbt.helper.serialize
import rs.rbt.jobrunrrbt.model.JobJson
import rs.rbt.jobrunrrbt.model.JobrunrJob
import rs.rbt.jobrunrrbt.repository.JobrunrJobRepository
import java.util.*

class JobService {

    lateinit var jobrunrJobRepository: JobrunrJobRepository

    fun returnListOfJobDTO(): List<JobDTO> {

        return jobrunrJobRepository.returnAllJobsForFront()

    }

    fun returnWhereStateMatchesListOfJobDTO(string: String): List<JobDTO> {

        return jobrunrJobRepository.returnAllJobsWithMatchingState(string)

    }

    fun returnWhereClassMAtchesListOfJobDTO(string: String): List<JobDTO> {

        return jobrunrJobRepository.returnAllJobsWithMatchingClass(string)

    }

    fun updateJobPackage(id: String,newClassName: String) {

        if (jobrunrJobRepository.existsById(id)) {

            val job: Optional<JobrunrJob> = jobrunrJobRepository.findById(id)
            val jobJson: JobJson = deserialize(job.get().jobasjson!!)
            val newJobSignature: String = newClassName.plus(".")
                .plus(jobJson.jobDetails.methodName)
                .plus("(")
                .plus(jobJson.jobDetails.jobParameters)
                .plus(")")

            jobJson.jobDetails.className = newClassName
            jobJson.jobSignature = newJobSignature

            val newJobJson: String = serialize(jobJson)

            jobrunrJobRepository.updateJobSignature(id, newJobSignature)
            jobrunrJobRepository.updateJobAsJson(id, newJobJson)

        }
    }

}