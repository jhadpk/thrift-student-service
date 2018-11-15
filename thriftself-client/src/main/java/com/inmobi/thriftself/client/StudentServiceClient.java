package com.inmobi.thriftself.client;

import com.inmobi.thriftself.thrift.models.TInternalServerException;
import com.inmobi.thriftself.thrift.models.TStudent;
import com.inmobi.thriftself.thrift.models.TStudentCourses;
import com.inmobi.thriftself.thrift.models.TStudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.transport.THttpClient;
import org.apache.thrift.transport.TTransportException;

import java.util.List;


@RequiredArgsConstructor
@Slf4j
public class StudentServiceClient implements TStudentService.Iface {
    private final String serverIp;
    private final Integer serverPort;

    private String getUrl() {
        final String serviceName = "/studentService/";
        return this.serverIp + ":" + serverPort + serviceName;
    }

    private TStudentService.Client getClient() throws TTransportException {
        THttpClient httpClient;
        httpClient = new THttpClient(getUrl());
        return new TStudentService.Client(new TBinaryProtocol(httpClient));
    }

    private void closeClient(final TStudentService.Client client) {
        if (null != client) {
            if (client.getInputProtocol().getTransport().isOpen()) {
                client.getInputProtocol().getTransport().close();
            }
            if (client.getOutputProtocol().getTransport().isOpen()) {
                client.getOutputProtocol().getTransport().close();
            }
        }
    }

    @Override
    public boolean insertStudent(TStudent studentToBeInserted) throws TInternalServerException, TException {
        log.info("insertStudent called.");
        TStudentService.Client client = null;
        try {
            client = getClient();
            client.insertStudent(studentToBeInserted);
        } finally {
            closeClient(client);
        }
        return true;
    }


    @Override
    public boolean updateStudent(TStudent studentToBeUpdated) throws TInternalServerException, TException {
        log.info("updateStudent called.");
        TStudentService.Client client = null;
        try {
            client = getClient();
            client.updateStudent(studentToBeUpdated);
        } finally {
            closeClient(client);
        }
        return true;
    }


    @Override
    public TStudent fetchStudent(int studentIndex) throws TInternalServerException, TException {
        log.info("fetchStudent called.");
        TStudentService.Client client = null;
        try {
            client = getClient();
            return client.fetchStudent(studentIndex);
        } finally {
            closeClient(client);
        }
    }


    @Override
    public boolean insertCourse(TStudentCourses courseToBeInserted) throws TInternalServerException, TException {
        log.info("insertCourse called.");
        TStudentService.Client client = null;
        try {
            client = getClient();
            client.insertCourse(courseToBeInserted);
        } finally {
            closeClient(client);
        }
        return true;
    }


    @Override
    public boolean updateCourse(TStudentCourses courseToBeUpdated) throws TInternalServerException, TException {
        log.info("updateCourse called.");
        TStudentService.Client client = null;
        try {
            client = getClient();
            client.updateCourse(courseToBeUpdated);
        } finally {
            closeClient(client);
        }
        return true;
    }


    @Override
    public TStudentCourses fetchCourse(int courseIndex) throws TInternalServerException, TException {
        log.info("fetchCourse called.");
        TStudentService.Client client = null;
        try {
            client = getClient();
            return client.fetchCourse(courseIndex);
        } finally {
            closeClient(client);
        }
    }


    @Override
    public List<TStudent> fetchStudents() throws TInternalServerException, TException {
        log.info("fetchStudents called.");
        TStudentService.Client client = null;
        try {
            client = getClient();
            return client.fetchStudents();
        } finally {
            closeClient(client);
        }
    }


    @Override
    public List<TStudent> fetchStudentsByName(String name) throws TInternalServerException, TException {
        log.info("fetchStudentsByName called.");
        TStudentService.Client client = null;
        try {
            client = getClient();
            return client.fetchStudentsByName(name);
        } finally {
            closeClient(client);
        }
    }


    @Override
    public List<TStudent> fetchStudentsByDepartment(String departmentName) throws TInternalServerException, TException {
        log.info("fetchStudentsByDepartment called.");
        TStudentService.Client client = null;
        try {
            client = getClient();
            return client.fetchStudentsByDepartment(departmentName);
        } finally {
            closeClient(client);
        }
    }


    @Override
    public List<TStudentCourses> fetchCourses() throws TInternalServerException, TException {
        log.info("fetchCourses called.");
        TStudentService.Client client = null;
        try {
            client = getClient();
            return client.fetchCourses();
        } finally {
            closeClient(client);
        }
    }


    @Override
    public List<TStudentCourses> fetchCoursesByName(String name) throws TInternalServerException, TException {
        log.info("fetchCoursesByName called.");
        TStudentService.Client client = null;
        try {
            client = getClient();
            return client.fetchCoursesByName(name);
        } finally {
            closeClient(client);
        }
    }


    @Override
    public List<TStudentCourses> fetchCoursesBySemester(int semester) throws TInternalServerException, TException {
        log.info("fetchCoursesBySemester called.");
        TStudentService.Client client = null;
        try {
            client = getClient();
            return client.fetchCoursesBySemester(semester);
        } finally {
            closeClient(client);
        }
    }
}
