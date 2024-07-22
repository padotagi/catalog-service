package com.poloarbookshop.catalogservice.domain;

public record Book (
  String isbn,
  String title,
  String author,
  Double price
){}
