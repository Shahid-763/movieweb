package com.example.movieweb1;

// 
// 
// import java.time.LocalDateTime;
// import java.util.List;
// 
import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
// import org.springframework.data.repository.query.Param;


public interface MovieRepository extends JpaRepository<MovieApp,Long> {

  // @Query("select m from MovieApp m where m.title:name")

  //  List<MovieApp> findByTitle(String name);
//   @Query("select m from MovieApp m where m.title Like:name%")

//    List<MovieApp> findByTitleLike(String name);
// @Query ("select m from MovieApp m where m.release_date>=:today")
// List<MovieApp> findByRelease_date(@Param("today")LocalDateTime today);


  }

    
    

