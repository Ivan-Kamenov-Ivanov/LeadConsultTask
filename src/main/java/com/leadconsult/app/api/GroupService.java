package com.leadconsult.app.api;

import com.leadconsult.app.models.Group;

import java.util.List;

public interface GroupService {

    Group addGroup(Group group);

    List<Group> findAllGroups();

    Group findGroupById(long id);

    void deleteGroupById(Long id);
}
