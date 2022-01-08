package net.javaguides.springbootbackend.repository;

import net.javaguides.springbootbackend.entity.Entry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntryRepository extends JpaRepository<Entry, Long> {
}
