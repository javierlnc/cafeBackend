package com.inn.cafe.serviceImpl;

import com.inn.cafe.POJO.User;
import com.inn.cafe.constents.CafeConstants;
import com.inn.cafe.dao.UserDao;
import com.inn.cafe.service.UserService;
import com.inn.cafe.utils.CafeUtils;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Map;
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    UserDao userDao;

    @Override
    public ResponseEntity<String> signUp(Map<String, String> requestMap) {
        log.info("Inside SignUp: {}", requestMap);
        if(validateSignUpMap(requestMap)){
            User user = userDao.fin;

        }else{
            return CafeUtils.getRequestEntity(CafeConstants.INVALID_ID_DATA, HttpStatus.BAD_REQUEST);
        }
        return  null;

    }
    private boolean validateSignUpMap(Map<String, String> requestMap){
       if( requestMap.containsKey("name") && requestMap.containsKey("contactNumber") && requestMap.containsKey("email") && requestMap.containsKey("password")){
           return true;
       }
       return false;

    }
}
