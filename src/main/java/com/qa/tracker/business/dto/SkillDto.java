package com.qa.tracker.business.dto;

public class SkillDto {
    
	private Integer skillId;
    private String SkillName;

    public SkillDto(Integer skillId, String skillName) {
        this.skillId = skillId;
        SkillName = skillName;
    }

    public SkillDto() {
    }

    public Integer getSkillId() {
        return skillId;
    }

    public void setSkillId(Integer skillId) {
        this.skillId = skillId;
    }

    public String getSkillName() {
        return SkillName;
    }

    public void setSkillName(String skillName) {
        SkillName = skillName;
    }
}
