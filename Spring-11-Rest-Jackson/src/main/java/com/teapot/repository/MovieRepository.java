package com.teapot.repository;

import com.teapot.entity.Movie;
import com.teapot.enums.MovieState;
import com.teapot.enums.MovieType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Long> {

// ------------------- DERIVED QUERIES ------------------- //

//Write a derived query to read a movie with a name
//    Optional<Movie> findByName(String name);
//
//    //Write a derived query to list all movies between a range of prices
//    List<Movie> findAllByPriceBetween(BigDecimal price1,BigDecimal price2);
//
//    //Write a derived query to list all movies where duration exists in the specific list of duration
//    List<Movie> findAllByDurationIn(List<Integer> durations);
//
//    //Write a derived query to list all movies with higher than a specific release date
//    List<Movie> findAllByReleaseDateAfter(LocalDate releaseDate);
//
//    //Write a derived query to list all movies with a specific state and type
//    List<Movie> findAllByStateAndType(MovieState movieState, MovieType movieType);
//
//    // ------------------- JPQL QUERIES ------------------- //
//
//    //Write a JPQL query to list all movies between a range of prices
//    @Query("SELECT m FROM Movie m WHERE m.price BETWEEN ?1 AND ?2")
//    List<Movie> fetchAllBetweenPricesRange(BigDecimal price1,BigDecimal price2);
//
//    //Write a JPQL query that returns all movie names
//    @Query("SELECT DISTINCT m.name FROM Movie m")
//    List<String> fetchAllMovieNames();
//
}