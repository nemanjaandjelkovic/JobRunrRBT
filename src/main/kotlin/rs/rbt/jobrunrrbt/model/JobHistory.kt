package rs.rbt.jobrunrrbt.model

import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.format.annotation.DateTimeFormat
import rs.rbt.jobrunrrbt.helper.AT_CLASS
import rs.rbt.jobrunrrbt.helper.DATE_TIME_STYLE
import rs.rbt.jobrunrrbt.helper.State
import java.time.Instant
import java.time.LocalDateTime

@JsonIgnoreProperties(ignoreUnknown = true)
class JobHistory (
    @JsonProperty(AT_CLASS)
    var atClass: String,
    var state: String,
    @DateTimeFormat(style = DATE_TIME_STYLE)
    @JsonFormat(pattern = DATE_TIME_STYLE)
    var createdAt: String,
    @DateTimeFormat(style = DATE_TIME_STYLE)
    @JsonFormat(pattern = DATE_TIME_STYLE)
    var scheduledAt: String?,
    var recurringJobId: String?,
    var reason: String?,

    )