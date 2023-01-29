package rs.rbt.jobrunrrbt.helper

const val QUERY_ALL_TO_DTO_LIST: String = "select new rs.rbt.jobrunrrbt.helper.JobDTO(JobrunrJob .id,JobrunrJob .jobsignature,JobrunrJob .state,JobrunrJob .scheduledat)"
const val QUERY_ALL_TO_DTO_LIST_WHERE_STATE_MATCHES: String = "select new rs.rbt.jobrunrrbt.helper.JobDTO(JobrunrJob .id,JobrunrJob .jobsignature,JobrunrJob .state,JobrunrJob .scheduledat) from JobrunrJob where JobrunrJob .state = ?1"
const val FILTER_PARAM: String = "filterParam"
const val DATE_TIME_STYLE: String = "yyyy-MM-dd'T'HH:mm:ss.SSSSSS'Z'"
const val JOBRUNR_JOBS_TABLE_NAME: String = "jobrunr_jobs"
const val ID: String = "id"
const val VERSION: String = "version"
const val JOBASJSON: String = "jobasjson"
const val JOBSIGNATURE: String = "jobsignature"
const val STATE: String = "state"
const val CREATEDAT: String = "createdat"
const val UPDATEDAT: String = "updatedat"
const val SCHEDULETAT: String = "scheduledat"
const val RECCURINGJOBID: String = "recurringjobid"
const val JOBRUNR_RECURRING_JOBS_TABLE_NAME: String = "jobrunr_recurring_jobs"
const val OBJECT: String = "object"
const val AT_CLASS: String = "@class"
const val UPDATE_JOB_SIGNATURE: String = "update JobrunrJob job set job.jobsignature = ?2 where job.id = ?1"
const val UPDATE_JOBASJSON: String = "update JobrunrJob job set job.jobasjson = ?2 where job.id = ?1"
const val VALUE: String = "value"
