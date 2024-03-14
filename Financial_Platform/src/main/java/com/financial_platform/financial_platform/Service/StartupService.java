package com.financial_platform.financial_platform.Service;

import com.financial_platform.financial_platform.Exception.ResourceNotFoundException;
import com.financial_platform.financial_platform.Model.Startup;
import com.financial_platform.financial_platform.Repository.StartupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StartupService {

    @Autowired
    private StartupRepository startupRepository;

    public List<Startup> getAllStartups() {
        return startupRepository.findAll();
    }

    public Startup getStartupById(Long id) {
        return startupRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found with id " + id));
    }

    /*
    This saves out Startup into DB
    Involves the REGISTER PAGE /api/startup/register and a POST method after GET
     */
    public Startup createStartup(Startup startup) {
        return startupRepository.save(startup);
    }

    public Startup updateStartup(Long id, Startup startupDetails) {
        Startup startup = startupRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Startup not found with id " + id));
        startup.setName(startupDetails.getName());
        startup.setEmail(startupDetails.getEmail());
        startup.setPassword(startupDetails.getPassword());
        startup.setDescription(startupDetails.getPassword());
        return startupRepository.save(startup);
    }

    public void deleteStartup(Long id) {
        startupRepository.deleteById(id);
    }
}

