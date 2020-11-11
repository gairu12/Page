package org.example.page.repos;

import org.example.page.domain.Message;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@EntityScan
public interface MessageRepo extends CrudRepository<Message, Long> {
    List<Message> findByTag(String tag);
}
