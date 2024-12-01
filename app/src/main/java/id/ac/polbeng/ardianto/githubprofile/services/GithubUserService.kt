package id.ac.polbeng.ardianto.githubprofile.services

import id.ac.polbeng.ardianto.githubprofile.models.GithubUser
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubUserService {
    fun loginUser(
        @Path("login") userLogin: String
    ): Call<GithubUser>
}