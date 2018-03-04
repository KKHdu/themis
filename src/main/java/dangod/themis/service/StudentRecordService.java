package dangod.themis.service;

import dangod.themis.model.vo.score.file.result.ImportResult;
import dangod.themis.model.vo.score.record.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface StudentRecordService {
    List<ActivityVo> getActivityByUserIdAndTerm(long userId, String term, Integer page, Integer size);

    List<ActivityVo> getActivityByStuIdAndTerm(String stuId, String term, Integer page, Integer size);

    List<HonorVo> getHonorByUserIdAndTerm(long userId, String term, Integer page, Integer size);

    List<HonorVo> getHonorByStuIdAndTerm(String stuId, String term, Integer page, Integer size);

    List<OfficeVo> getOfficeByUserIdAndTerm(long userId, String term, Integer page, Integer size);

    List<OfficeVo> getOfficeByStuIdAndTerm(String stuId, String term, Integer page, Integer size);

    List<PracticeVo> getPracticeByUserIdAndTerm(long userId, String term, Integer page, Integer size);

    List<PracticeVo> getPracticeByStuIdAndTerm(String stuId, String term, Integer page, Integer size);

    List<ReserveVo> getReserveByUserIdAndTerm(long userId, String term, Integer page, Integer size);

    List<ReserveVo> getReserveByStuIdAndTerm(String stuId, String term, Integer page, Integer size);

    List<SkillVo> getSkillByUserIdAndTerm(long userId, String term, Integer page, Integer size);

    List<SkillVo> getSkillByStuIdAndTerm(String stuId, String term, Integer page, Integer size);

    List<VolunteerVo> getVolunteerByUserIdAndTerm(long userId, String term, Integer page, Integer size);

    List<VolunteerVo> getVolunteerByStuIdAndTerm(String stuId, String term, Integer page, Integer size);

    ImportResult addActivityByFile(MultipartFile file, String opName);

//    public ImportResult addHonorByFile(MultipartFile file, String opName);
//
//    public ImportResult addOfficeByFile(MultipartFile file, String opName);
//
//    public ImportResult addPracticeByFile(MultipartFile file, String opName);
//
//    public ImportResult addReserveByFile(MultipartFile file, String opName);
//
//    public ImportResult addSkillByFile(MultipartFile file, String opName);
//
//    public ImportResult addVolunteerByFile(MultipartFile file, String opName);
}
