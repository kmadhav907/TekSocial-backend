package com.social.controller;

import com.cloudinary.utils.ObjectUtils;
import com.social.dto.ProfileRequest;
import com.social.dto.UploadFileResponse;
import com.social.service.CloudinaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
public class ProfileController {


    @Autowired
    private CloudinaryService cloudinaryService;

    @RequestMapping(value = "/uploadprofileimage", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<?> uploadProfileImage(@RequestParam("file") MultipartFile file, @RequestParam("userId") Long empId){
        try {
            Map results = cloudinaryService.upload(file.getBytes(), ObjectUtils.asMap("resourcetype", "auto"));
            UploadFileResponse uploadFileResponse = new UploadFileResponse();
            uploadFileResponse.setStatus("success");
            uploadFileResponse.setData("File Uploaded successfully");
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(uploadFileResponse);
        }catch (Exception e) {
            e.printStackTrace();
            UploadFileResponse uploadFileResponse = new UploadFileResponse();
            uploadFileResponse.setStatus("error");
            uploadFileResponse.setData("Something went wrong");
            return ResponseEntity.status(500).body(uploadFileResponse);
        }
    }
    @RequestMapping(value = "/profile", method = RequestMethod.POST)
    public ResponseEntity<?> updateProfile(@RequestBody ProfileRequest profileRequest){
        System.out.println(profileRequest);
        return ResponseEntity.ok("updated successfully");
    }
}
