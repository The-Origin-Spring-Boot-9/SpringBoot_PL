package dev.aquashdw.jpa.repository;

import dev.aquashdw.jpa.entity.BoardEntity;
import dev.aquashdw.jpa.entity.PostEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

//인터페이스 - jpa에서 제공하는 인터페이스를 받아서
public interface PostRepository extends CrudRepository<PostEntity, Long> {

    List<PostEntity> findAllByWriter(String writer);
    List<PostEntity> findAllByWriterAndBoardEntity(String writer, BoardEntity boardEntity);
    List<PostEntity> findAllByWriterContaining(String writer);
}
