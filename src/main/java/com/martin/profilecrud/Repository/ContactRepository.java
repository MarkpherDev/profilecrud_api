package com.martin.profilecrud.Repository;

import com.martin.profilecrud.Entity.Contact;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact,String> {
  Optional<Contact> findById(String id);
}
