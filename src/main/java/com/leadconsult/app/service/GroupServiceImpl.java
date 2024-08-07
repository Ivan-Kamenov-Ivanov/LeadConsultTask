package com.leadconsult.app.service;

import com.leadconsult.app.api.GroupService;
import com.leadconsult.app.models.Group;
import com.leadconsult.app.repo.GroupRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class GroupServiceImpl implements GroupService {

    private final GroupRepository groupRepository;

    public GroupServiceImpl(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @Override
    @Transactional
    public Group addGroup(Group group) {              //custom Exception handling to be added
        if(groupRepository.existsById(group.getId())){
           return groupRepository.save(group);
        }
        return null;
    }

    @Override
    public List<Group> findAllGroups() {
        return List.of();
    }

    @Override
    public Group findGroupById(long id) {               //custom Exception handling to be added
        Optional<Group> result = groupRepository.findById(id);
        return result.orElseThrow(null);
    }

    @Override
    public void deleteGroupById(Long id) {            //custom Exception handling to be added
        if(groupRepository.existsById(id)){
            groupRepository.deleteById(id);
        }
    }
}
