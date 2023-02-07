package com.example.demo.repository;

import com.example.demo.entity.Singer;
import com.google.cloud.spanner.Key;
import com.google.cloud.spanner.Mutation;
import com.google.cloud.spring.data.spanner.repository.SpannerRepository;

import java.util.Optional;


public interface DemoRepo extends SpannerRepository<Singer, Key> {
   Optional<Singer> findById(String id);
}
