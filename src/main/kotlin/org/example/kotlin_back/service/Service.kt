package org.example.kotlin_back.service

import org.example.kotlin_back.entity.NetflixEntity
import org.example.kotlin_back.repository.NetflixRepository
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Service

@Service
class NetflixService(
    val netflixRepository: NetflixRepository,
    private val jdbcTemplate: JdbcTemplate
) {

    fun readAllMovies(): List<NetflixEntity> {

        val sql = "select * from netflix"
        return jdbcTemplate.query(sql) { rs, _ ->
            NetflixEntity(
                id = rs.getInt("id"),
                movie = rs.getString("movie"),
                country = rs.getString("country"),
            )
        }
    }
}