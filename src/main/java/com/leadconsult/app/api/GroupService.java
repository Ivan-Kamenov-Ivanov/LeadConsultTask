package com.leadconsult.app.api;

import com.leadconsult.app.models.Group;

public interface GroupService {

    boolean addGroup(Group group);

    boolean deleteGroupById(Long id);

    Group findGroupById(long id);
}
