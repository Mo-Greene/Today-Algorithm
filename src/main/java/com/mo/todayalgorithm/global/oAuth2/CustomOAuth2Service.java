package com.mo.todayalgorithm.global.oAuth2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CustomOAuth2Service extends DefaultOAuth2UserService {

    public OAuth2User loadUser(OAuth2UserRequest request) {
        return super.loadUser(request);
    }
}
