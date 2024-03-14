//package com.financial_platform.financial_platform.Controller;
//
//import com.financial_platform.financial_platform.Service.StartupService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
///**
// * Controlerul pentru gestionarea participanților.
// */
//@RestController
//@CrossOrigin(origins="*", allowedHeaders = "*")
//@RequestMapping("/api/participants")
//public class StartupController {
//    private final StartupService startupService;
//
//    @Autowired
//    public StartupController(StartupService startupService) {
//        this.startupService = startupService;
//    }
//
//    /**
//     * Endpoint pentru obținerea tuturor participanților.
//     *
//     * @return Lista de obiecte ParticipantDto.
//     */
//    @GetMapping("")
//    public List<StartupDto> getAllStartups() {
//        return startupService.getAllStartups();
//    }
//
//    /**
//     * Endpoint pentru adăugarea unui startup.
//     *
//     * @param addStartupRequest Obiectul de tip AddStartupRequest care conține informațiile necesare pentru adăugarea unui participant.
//     * @return Obiectul StartupDto reprezentând startup-ul adăugat.
//     */
//    @PostMapping("/addParticipant")
//    public StartupDto addParticipant(@RequestBody AddStartupRequest addStartupRequest){
//        return startupService.addParticipant(addParticipantRequest);}
//}
