package dangod.themis.service;

import dangod.themis.model.vo.score.StudentBaseInfoVo;

import java.util.List;

public interface StudentBaseInfoService {
    StudentBaseInfoVo getStudentBaseById(long id);

    StudentBaseInfoVo getStudentBaseByUserId(long userId);

    StudentBaseInfoVo getStudentBaseByStuId(String stuId);

    List<StudentBaseInfoVo> getStudentListBaseAll(Integer page, Integer size);

    List<StudentBaseInfoVo> getStudentListBaseByDormitory(long dormitoryId, Integer page, Integer size);

    List<StudentBaseInfoVo> getStudentListBaseByClass(long classId, Integer page, Integer size);

    List<StudentBaseInfoVo> getStudentListBaseByMajor(long majorId, Integer page, Integer size);

    boolean checkStuClass(String stuId, long classId);

    boolean checkStuMajor(String stuId, long majorId);

    boolean checkClassMajor(long classId, long majorId);

    StudentBaseInfoVo updateBaseInfo(String stuId, String realName, String sex, long classId,
                                     String photo, String entranceTime, long dormitoryId, String political);

    StudentBaseInfoVo updateBaseInfo(String stuId, String political);

    StudentBaseInfoVo updateBaseInfo(String stuId, long dormitoryId, String political);
}