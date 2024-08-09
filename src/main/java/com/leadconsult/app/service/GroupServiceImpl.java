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
    public Group addGroup(Group group) {
        try {
            return groupRepository.save(group);
        } catch (IllegalArgumentException e){
            throw new IllegalArgumentException("Invalid data", e);
        }
    }

    @Override
    public List<Group> findAllGroups() {
        return List.of();
    }

    @Override
    public Group findGroupById(long id) {
        Optional<Group> result = groupRepository.findById(id);
        return result.orElseThrow(null);
    }

    @Override
    public boolean deleteGroupById(Long id) {
        if(groupRepository.existsById(id)){
            groupRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
