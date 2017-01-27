package info.metadude.kotlin.library.c3media

import info.metadude.kotlin.library.c3media.models.Conference
import info.metadude.kotlin.library.c3media.models.ConferencesResponse
import info.metadude.kotlin.library.c3media.models.Event
import info.metadude.kotlin.library.c3media.models.Recording
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface C3MediaService {

    @GET("public/conferences")
    fun getConferences(): Call<ConferencesResponse>

    @GET("public/conferences/{conferenceId}")
    fun getConference(@Path("conferenceId") conferenceId: Int): Call<Conference>

    @GET("public/events")
    fun getEvents(): Call<List<Event>>

    @GET("public/events/{eventId}")
    fun getEvent(@Path("eventId") eventId: Int): Call<Event>

    @GET("public/recordings")
    fun getRecordings(): Call<List<Recording>>

    @GET("public/recordings/{recordingsId}")
    fun getRecording(@Path("recordingsId") recordingsId: Int): Call<Recording>

}
