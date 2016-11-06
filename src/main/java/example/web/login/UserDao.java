package example.web.login;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by yookeun on 2016. 9. 15..
 */

@Repository
public class UserDao {

    @Autowired
    private SqlSession sqlSession;

    public int check(UserDto userDto) { return sqlSession.selectOne("userMapper.check", userDto); }

    public UserDto select(String username) {
        return sqlSession.selectOne("userMapper.select", username);
    }

}
