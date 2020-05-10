package com.sample.githubbrowser.githubapi

import com.sample.githubbrowser.githubapi.model.RepoApiModel
import com.sample.githubbrowser.githubapi.model.UserApiModel
import javax.inject.Inject
import javax.inject.Singleton

interface GitHubApi {

    suspend fun getTopRepositories(): TopReposSearchResult
}

@Singleton
class MockGitHubApi @Inject constructor() : GitHubApi {
    override suspend fun getTopRepositories(): TopReposSearchResult {
        return TopReposSearchResult(
            listOf(
                RepoApiModel(
                    id = 1L,
                    name = "Mock Repo",
                    description = "Mock Repo Description",
                    owner = UserApiModel(id = 1L, login = "dagger"),
                    stargazersCount = 1,
                    forksCount = 1,
                    contributorsUrl = "",
                    createdDate = "1/1/2020",
                    updatedDate = "1/1/2020"
                ),
                RepoApiModel(
                    id = 1L,
                    name = "Mock Repo",
                    description = "Mock Repo Description",
                    owner = UserApiModel(id = 1L, login = "dagger"),
                    stargazersCount = 1,
                    forksCount = 1,
                    contributorsUrl = "",
                    createdDate = "1/1/2020",
                    updatedDate = "1/1/2020"
                ),
                RepoApiModel(
                    id = 1L,
                    name = "Mock Repo",
                    description = "Mock Repo Description",
                    owner = UserApiModel(id = 1L, login = "dagger"),
                    stargazersCount = 1,
                    forksCount = 1,
                    contributorsUrl = "",
                    createdDate = "1/1/2020",
                    updatedDate = "1/1/2020"
                )
            )
        )
    }

}