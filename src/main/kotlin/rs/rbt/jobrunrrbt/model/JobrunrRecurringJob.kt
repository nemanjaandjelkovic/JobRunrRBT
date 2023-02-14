package rs.rbt.jobrunrrbt.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import rs.rbt.jobrunrrbt.helper.*

@Entity
@Table(name = JOBRUNR_RECURRING_JOBS_TABLE_NAME)
open class JobrunrRecurringJob {
    @Id
    @Column(name = ID, nullable = false, length = 128)
    open var id: String? = null

    @Column(name = VERSION, nullable = false)
    open var version: Int? = null

    @Column(name = JOBASJSON, nullable = false, length = Integer.MAX_VALUE)
    open var jobasjson: String? = null

    @Column(name = CREATEDAT, nullable = false)
    open var createdat: Long? = null
}