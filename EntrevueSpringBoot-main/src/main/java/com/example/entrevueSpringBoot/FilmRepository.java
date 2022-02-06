package com.example.entrevueSpringBoot;

import org.springframework.data.jpa.repository.JpaRepository;

interface FilmRepository extends JpaRepository<Film,Long> {
}
