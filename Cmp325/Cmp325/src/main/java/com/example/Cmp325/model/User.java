package com.example.Cmp325.model;
import jakarta.persistence.Entity;
import org.springframework.data.annotation.Id;
import org.springframework.lang.NonNull;
@Entity

public class User {
    @jakarta.persistence.Id
    private long id;
    public void setId(Long id){
        this.id= id;
    }
    public Long grtId(){
        return id;

    }
    private class UserName {
        @Id
        public long id;

        @NonNull
        private String username;
        private String password;
        private String email;
    }


}
