package com.leadconsult.app.controller;

import com.leadconsult.app.api.GroupService;
import com.leadconsult.app.models.Group;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/groups")
public class GroupController {

    private final GroupService groupService;

    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }

    @PostMapping
    public Group addGroup(@RequestBody Group group){
        return groupService.addGroup(group);
    }

    @GetMapping
    public List<Group> findAllGroups(){
        return groupService.findAllGroups();
    }

    @GetMapping("{id}")
    public Group findGroupById(@PathVariable Long id){
        return groupService.findGroupById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteGroupById(@PathVariable Long id){
        groupService.deleteGroupById(id);
    }
}
