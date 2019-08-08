package sloth.zhang.miaosha.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import sloth.zhang.miaosha.dataobject.UserPassword;
import sloth.zhang.miaosha.dataobject.UserPasswordExample;

public interface UserPasswordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Thu Aug 08 11:11:38 CST 2019
     */
    long countByExample(UserPasswordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Thu Aug 08 11:11:38 CST 2019
     */
    int deleteByExample(UserPasswordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Thu Aug 08 11:11:38 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Thu Aug 08 11:11:38 CST 2019
     */
    int insert(UserPassword record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Thu Aug 08 11:11:38 CST 2019
     */
    int insertSelective(UserPassword record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Thu Aug 08 11:11:38 CST 2019
     */
    List<UserPassword> selectByExample(UserPasswordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Thu Aug 08 11:11:38 CST 2019
     */
    UserPassword selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Thu Aug 08 11:11:38 CST 2019
     */
    int updateByExampleSelective(@Param("record") UserPassword record, @Param("example") UserPasswordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Thu Aug 08 11:11:38 CST 2019
     */
    int updateByExample(@Param("record") UserPassword record, @Param("example") UserPasswordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Thu Aug 08 11:11:38 CST 2019
     */
    int updateByPrimaryKeySelective(UserPassword record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_password
     *
     * @mbg.generated Thu Aug 08 11:11:38 CST 2019
     */
    int updateByPrimaryKey(UserPassword record);
}