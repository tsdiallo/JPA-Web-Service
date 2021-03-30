package com.example.JPA.Web.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RestController;

public  interface CarRepository extends CrudRepository<Car, Long>{

}

