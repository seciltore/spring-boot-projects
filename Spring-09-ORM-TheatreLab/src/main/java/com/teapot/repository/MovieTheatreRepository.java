package com.teapot.repository;

import com.teapot.entity.MovieTheatre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.List;

public interface MovieTheatreRepository extends JpaRepository<MovieTheatre, Long> {
    // ------------------- DERIVED QUERIES ------------------- //

    //Write a derived query to read movie theatre with id

    Optional<MovieTheatre> findById(Long id);

    //Write a derived query to count all movie theatre with a specific theatre id
    Integer countAllByTheatreId(Long theatreId);

    //Write a derived query to count all movie theatres with a specific movie id
    Integer countAllByMovieId(Integer movieId);

    //Write a derived query to list all movie theatres with higher than a specific date
    List<MovieTheatre> findAllByDateTimeAfter(LocalDateTime dateTime);

    //Write a derived query to find the top 3 expensive movies
    List<MovieTheatre> findFirst3ByOrderByMoviePriceAsc();

    //Write a derived query to list all movie theatres that contain a specific movie name
    List<MovieTheatre> findAllByMovieNameContaining(String name);

    //Write a derived query to list all movie theatres in a specific location
    List<MovieTheatre> findAllByTheatreLocationName(String name);

    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query to list all movie theatres with after a specific date

    @Query("SELECT mt FROM MovieTheatre mt WHERE mt.dateTime > ?1")
    List<MovieTheatre> fetchAllWithHigherSpecificDateJPQL(LocalDateTime dateTime);


    // ------------------- Native QUERIES ------------------- //

    //Write a native query to count all movie theatres by theatre id
    @Query(value = "SELECT count(*) FROM movie_theatre WHERE theatre_id = ?1 ",nativeQuery = true)
    Integer countByTheatreIdNativeQuery(Long theatreId);

    //Write a native query that returns all movie theatres by location name
    @Query(value = "SELECT * FROM movie_theatre JOIN theatre t on t.id = movie_theatre.theatre_id  JOIN location l on t.location_id=l.id WHERE l.name = ?1",nativeQuery = true)
    List<MovieTheatre> retrieveAllByLocationName(String locationName);

}


