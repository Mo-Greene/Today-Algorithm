package com.mo.todayalgorithm.global.entity;

import com.mo.todayalgorithm.global.entity.core.BaseEntity;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Comment;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Getter
@Table(name = "member")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@DynamicUpdate
@Comment("회원 테이블")
public class Member extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Comment("회원 pk")
    private Long id;

    @Column(length = 25, nullable = false, unique = true)
    @Comment("아이디")
    private String username;

    @Column(nullable = false)
    @Comment("프로필 이미지")
    private String profileImage;

    @Column(nullable = false)
    @Comment("개인수준")
    private Integer personalLevel;
}
