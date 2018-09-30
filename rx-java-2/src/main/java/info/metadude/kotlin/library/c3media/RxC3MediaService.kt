package info.metadude.kotlin.library.c3media

import info.metadude.kotlin.library.c3media.models.Conference
import info.metadude.kotlin.library.c3media.models.ConferencesResponse
import info.metadude.kotlin.library.c3media.models.Event
import info.metadude.kotlin.library.c3media.models.EventsResponse
import info.metadude.kotlin.library.c3media.models.Recording
import info.metadude.kotlin.library.c3media.models.RecordingsResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface RxC3MediaService {

    @GET("public/conferences")
    fun getConferences(): Single<ConferencesResponse>

    @GET("public/conferences/{conferenceId}")
    fun getConference(@Path("conferenceId") conferenceId: Int): Single<Conference>

    @GET("public/conferences/{acronym}")
    fun getConference(@Path("acronym") acronym: String): Single<Conference>

    @GET("public/events")
    fun getEvents(): Single<EventsResponse>

    @GET("public/events/search")
    fun searchEvents(@Query("q") query: String): Single<EventsResponse>

    @GET("public/events/{guid}")
    fun getEvent(@Path("guid") guid: String): Single<Event>

    @GET("public/events/{eventId}")
    fun getEvent(@Path("eventId") eventId: Int): Single<Event>

    @GET("public/recordings")
    fun getRecordings(): Single<RecordingsResponse>

    @GET("public/recordings/{recordingsId}")
    fun getRecording(@Path("recordingsId") recordingsId: Int): Single<Recording>

}