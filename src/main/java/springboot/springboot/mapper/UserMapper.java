package springboot.springboot.mapper;


import org.springframework.stereotype.Repository;

/**
 * @author 我命倾尘
 */
@Repository
public interface UserMapper {
    int getAgeByUsername(String username);
}


