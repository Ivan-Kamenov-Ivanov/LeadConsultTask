package com.leadconsult.app.service;

import com.leadconsult.app.api.GroupService;
import com.leadconsult.app.models.Group;
import com.leadconsult.app.repo.GroupRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public class GroupServiceImpl implements GroupService {

    private final GroupRepository groupRepository;

    public GroupServiceImpl(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @Override
    @Transactional
    public boolean addGroup(Group group) {              //custom Exception handling to be added
        if(groupRepository.existsById(group.getId())){
            return false;
        }
        groupRepository.save(group);
        return true;
    }

    @Override
    public boolean deleteGroupById(Long id) {            //custom Exception handling to be added

        if(!groupRepository.existsById(id)){
            return false;
        }
        groupRepository.deleteById(id);
        return true;
    }

    @Override
    public Group findGroupById(long id) {               //custom Exception handling to be added
        Optional<Group> result = groupRepository.findById(id);
        return result.orElseThrow(null);
    }
}
