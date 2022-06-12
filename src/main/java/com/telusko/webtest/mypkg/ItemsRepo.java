package com.telusko.webtest.mypkg;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ItemsRepo extends JpaRepository<Items, Integer>{

}
