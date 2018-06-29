package com.qa.tracker.util;

import com.qa.tracker.business.dto.SkillDto;
import com.qa.tracker.persistence.domain.Skill;

public class SkillConverter {
	
	public static Skill dtoToEntity(SkillDto SkillDto) {
		Skill Skill = new Skill(SkillDto.getSkillName(), null);
		Skill.setSkillId(SkillDto.getSkillId());
		return Skill;
	}

	public static SkillDto entityToDto(Skill skill) {
		return new SkillDto(skill.getSkillId(), skill.getSkillName());
	}
}
