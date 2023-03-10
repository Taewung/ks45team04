package ks45team04.sos.admin.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import ks45team04.sos.admin.dto.PointFeeRate;
import ks45team04.sos.admin.dto.PointRefundApproval;
import ks45team04.sos.admin.dto.PointSaveStandard;
import ks45team04.sos.admin.dto.PointSaveUse;
import ks45team04.sos.admin.mapper.PointFeeRateMapper;
import ks45team04.sos.admin.mapper.PointRefundApprovalMapper;
import ks45team04.sos.admin.mapper.PointSaveStandardMapper;
import ks45team04.sos.admin.mapper.PointSaveUseMapper;
import ks45team04.sos.admin.service.PointFeeRateService;
import ks45team04.sos.admin.service.PointRefundApprovalService;
import ks45team04.sos.admin.service.PointSaveStandardService;
import ks45team04.sos.admin.service.PointSaveUseService;

@Controller
public class APointController {

	private static final Logger log = LoggerFactory.getLogger(APointController.class);
	
	private final PointSaveUseService pointSaveUseService;
	private final PointSaveUseMapper pointSaveUseMapper;
	private final PointSaveStandardService pointSaveStandardService;
	private final PointSaveStandardMapper pointSaveStandardMapper;
	private final PointFeeRateService pointFeeRateService;
	private final PointFeeRateMapper pointFeeRateMapper;
	private final PointRefundApprovalService pointRefundApprovalService;
	private final PointRefundApprovalMapper pointRefundApprovalMapper;
	
	public APointController(PointSaveUseService pointSaveUseService, 
							PointSaveUseMapper pointSaveUseMapper , 
							PointSaveStandardService pointSaveStandardService,
							PointSaveStandardMapper pointSaveStandardMapper,
							PointFeeRateService pointFeeRateService,
							PointFeeRateMapper pointFeeRateMapper,
							PointRefundApprovalService pointRefundApprovalService,
							PointRefundApprovalMapper pointRefundApprovalMapper) {
		
		this.pointSaveUseService = pointSaveUseService;
		this.pointSaveUseMapper = pointSaveUseMapper;
		this.pointSaveStandardService = pointSaveStandardService;
		this.pointSaveStandardMapper = pointSaveStandardMapper;
		this.pointFeeRateService = pointFeeRateService;
		this.pointFeeRateMapper = pointFeeRateMapper;
		this.pointRefundApprovalService = pointRefundApprovalService;
		this.pointRefundApprovalMapper = pointRefundApprovalMapper;
		
	}
	
	// ????????? ?????? ?????? ??????
	@GetMapping("/deletePointSaveStandard")
	public String deletePointSaveStandard(PointSaveStandard pointSaveStandard, RedirectAttributes reAttr) {
		
		String pointSaveStandardCode = pointSaveStandard.getPointSaveStandardCode();
		String redirectURI = "redirect:/pointSaveStandardList";

		pointSaveStandardService.deletePointSaveStandard(pointSaveStandardCode);
		
		return redirectURI;
	}
	
	//????????? ?????? ?????? ?????? ??????
	@PostMapping("/modifyPointSaveStandard")
	public String modifyPointSaveStandard(PointSaveStandard pointSaveStandard) {
		
		pointSaveStandardService.modifyPointSaveStandard(pointSaveStandard);
		
		return "redirect:/pointSaveStandardList";
	}
	
	// ????????? ?????? ?????? ?????? ??????
	@GetMapping("/modifyPointSaveStandard")
	public String modifyPointSaveStandard(@RequestParam(value="pointSaveStandardCode") String pointSaveStandardCode
										  ,Model model) {
		
		PointSaveStandard pointSaveStandard = pointSaveStandardService.getPointSaveStandardInfoByCode(pointSaveStandardCode);
		
		model.addAttribute("title", "????????? ?????? ?????? ??????");
		model.addAttribute("pointSaveStandardInfo", pointSaveStandard);

		return "admin/point/point_save_standard_modify";
	}
	
	//????????? ?????? ?????? ?????? ????????? ??????
	@GetMapping("/pointSaveStandardIdCheck")
	@ResponseBody
	public boolean pointSaveStandardIdCheck(@RequestParam(value="inputId") String inputId){
		
		boolean isChecked = pointSaveStandardMapper.getPointSaveStandardIdCheck(inputId);
		
		return isChecked;
	}

	// ????????? ?????? ?????? ?????? ??????
	@PostMapping("/addPointSaveStandard")
	public String addPointSaveStandard(PointSaveStandard PointSaveStandard) {
		
		//????????? ?????? ?????? ?????? ????????????
		String newPointSaveStandardCode = pointSaveStandardService.getPointSaveStandardCode("pointSaveStandard","pointSaveStandardCode");
				
		PointSaveStandard.setPointSaveStandardCode(newPointSaveStandardCode);
		pointSaveStandardService.addPointSaveStandard(PointSaveStandard);
		
		return "redirect:/pointSaveStandardList";
	}
	
	// ????????? ?????? ?????? ?????? ??????
	@GetMapping("/addPointSaveStandard")
	public String addPointSaveStandard(Model model) {
		
		//List<PointSaveStandard> pointSaveStandardList = pointSaveStandardMapper.pointSaveStandardList();
		
		model.addAttribute("title", "????????? ?????? ?????? ??????");
		//model.addAttribute("pointSaveStandardList", pointSaveStandardList);
		
		return "admin/point/point_save_standard_insert";
	}

	
	// ????????? ?????? ?????? ??????
	@GetMapping("/pointSaveStandardList")
	public String pointSaveStandardList(Model model,
										@RequestParam(value="searchKey", required = false) String searchKey,
										@RequestParam(value="searchValue", required = false, defaultValue="")String searchValue) {
		
		List<PointSaveStandard> pointSaveStandardList = pointSaveStandardService.PointSaveStandardList(searchKey, searchValue);

		model.addAttribute("title", "????????? ?????? ?????? ??????");
		model.addAttribute("pointSaveStandardList", pointSaveStandardList);
		
		return "admin/point/point_save_standard_list";
	}
	
	// ????????? ???????????? ??????
	@GetMapping("/deletePointfeeRate")
	public String deletePointfeeRate(PointFeeRate pointFeeRate, RedirectAttributes reAttr) {
		
		String pointFeeRateCode = pointFeeRate.getPointFeeRateCode();
		String redirectURI = "redirect:/pointFeeRateList";
		
		pointFeeRateService.deletePointfeeRate(pointFeeRateCode);

		return redirectURI;
	}
	
	// ????????? ???????????? ?????? ??????
	@PostMapping("/modifyPointFeeRate")
	public String modifyPointFeeRate(PointFeeRate pointFeeRate) {
		
		pointFeeRateService.modifyPointFeeRate(pointFeeRate);
		
		return "redirect:/pointFeeRateList";
	}
	
	// ????????? ???????????? ?????? ??????
	@GetMapping("/modifyPointfeeRate")
	public String modifyPointfeeRate(@RequestParam(value="pointFeeRateCode") String pointFeeRateCode,
									 Model model) {
		
		PointFeeRate pointFeeRate = pointFeeRateService.getPointFeeRateInfoByCode(pointFeeRateCode);
		
		model.addAttribute("title", "????????? ???????????? ??????");
		model.addAttribute("pointFeeRateInfo",pointFeeRate);

		return "admin/point/point_fee_rate_modify";
	}
	
	//????????? ???????????? ?????? ????????? ??????
	@GetMapping("/pointFeeRateIdCheck")
	@ResponseBody
	public boolean pointFeeRateIdCheck(@RequestParam(value="inputId") String inputId){
	
		boolean isChecked = pointFeeRateMapper.getPointFeeRateIdCheck(inputId);
		
		return isChecked;
	}

	
	// ????????? ???????????? ?????? ??? ??????
	@GetMapping("/pointFeeRateList")
	public String pointFeeRateList(Model model,
								   @RequestParam(value="searchKey", required = false) String searchKey,
								   @RequestParam(value="searchValue", required = false, defaultValue="")String searchValue) {
			
		List<PointFeeRate> pointFeeRateList = pointFeeRateService.PointFeeRateList(searchKey, searchValue);
			
		model.addAttribute("title", "????????? ???????????? ??????");
		model.addAttribute("pointFeeRateList", pointFeeRateList);

		return "admin/point/point_fee_rate_list";
	}
	

	// ????????? ???????????? ?????? ??????
	@PostMapping("/addPointFeeRate")
	public String addPointFeeRate(PointFeeRate PointFeeRate) {

		//????????? ?????? ?????? ?????? ????????????
		String newPointFeeRateCode = pointFeeRateService.getPointFeeRateCode("pointFeeRate","pointFeeRateCode");
		
		PointFeeRate.setPointFeeRateCode(newPointFeeRateCode);
		pointFeeRateService.addPointFeeRate(PointFeeRate);
		
		return "redirect:/pointFeeRateList";
	}
	
	// ????????? ???????????? ?????? ??????
	@GetMapping("/addPointFeeRate")
	public String addPointFeeRate(Model model) {
		
		List<PointFeeRate> pointFeeRateList = pointFeeRateMapper.pointFeeRateList(null, null);
		
		model.addAttribute("title", "????????? ???????????? ??????");
		model.addAttribute("pointFeeRateList",pointFeeRateList);

		return "admin/point/point_fee_rate_insert";
	}
	
	// ????????? ?????? ?????? ??????
	@PostMapping("/pointSaveUseAdd")
	public String pointSaveUseAdd(PointSaveUse pointSaveUse) {
		
		//????????? ?????? ?????? ?????? ????????????
		String newPointSaveUseCode = pointSaveUseService.getPointSaveUseCode("pointSaveUse", "pointSaveUseCode");
		
		pointSaveUse.setPointSaveUseCode(newPointSaveUseCode);
		pointSaveUseService.pointSaveUseadd(pointSaveUse);
		
		
		return "redirect:/pointSaveUseList";
	}
	
	// ????????? ?????? ?????? ??????
	@GetMapping("/pointSaveUseAdd")
	public String pointSaveUsePointAdd(Model model) {
		
		List<PointSaveStandard> pointSaveStandardContentList = pointSaveStandardService.getPointSaveStandardContent();
		log.info("pointSaveStandardContentList--> " +pointSaveStandardContentList);
		
		List<PointSaveStandard> pointSaveStandardList = pointSaveStandardService.PointSaveStandardList(null, null);
		log.info("pointSaveStandardList-->" + pointSaveStandardList);
		
		model.addAttribute("title", "????????? ?????? ??????");
		model.addAttribute("pointSaveStandardList", pointSaveStandardList);
		
		return "admin/point/point_save_use_add";
	}
	


	// ????????? ??????/?????? ?????? ??????(??????)
	@GetMapping("/pointSaveUseList")
	@SuppressWarnings("unchecked")
	public String pointSaveUseList(Model model
								  ,@RequestParam(value="currentPage", required = false, defaultValue = "1") int currentPage
								  ,@RequestParam(value="searchKey", required = false) String searchKey
								  ,@RequestParam(value="searchValue", required = false, defaultValue = "") String searchValue){

		Map<String, Object> paramMap = pointSaveUseService.PointSaveUseList(currentPage, searchKey, searchValue);
		int lastPage = (int) paramMap.get("lastPage");
		List<PointSaveUse> pointSaveUseList = (List<PointSaveUse>) paramMap.get("pointSaveUseList");
		int startPageNum = (int) paramMap.get("startPageNum");
		int endPageNum = (int) paramMap.get("endPageNum");
		
		model.addAttribute("title", "????????? ??????/?????? ??????");
		model.addAttribute("currentPage", currentPage);
		model.addAttribute("pointSaveUseList", pointSaveUseList);
		model.addAttribute("lastPage", lastPage);
		model.addAttribute("startPageNum", startPageNum);
		model.addAttribute("endPageNum", endPageNum);
		
		log.info("????????? ??????/?????? ?????? ?????? : {}", pointSaveUseList);
		
		return "admin/point/point_save_use_list";
	}
	
	 // ????????? ?????? ?????? ?????? ??????
	 @GetMapping("/deletePointRefundApproval") 
	 public String deletePointRefundApproval(PointRefundApproval pointRefundApproval, RedirectAttributes reAttr) {
		 
		 String pointRefundCode = pointRefundApproval.getPointRefundCode();
		 String redirectURI = "redirect:/pointRefundApprovalList";
		 
		 pointRefundApprovalService.deletePointRefundApproval(pointRefundCode);
	 
		 return redirectURI; 
	}
	 
	
	// ????????? ?????? ?????? ?????? ?????? ??????
	@PostMapping("/modifyPointRefundApproval")
	public String modifyPointRefundApproval(PointRefundApproval pointRefundApproval) {
		
		pointRefundApprovalService.modifyPointRefundApproval(pointRefundApproval);
		
		return "redirect:/pointRefundApprovalList";
	}
	
	// ????????? ?????? ?????? ?????? ?????? ??????
	@GetMapping("/modifyPointRefundApproval")
	public String modifyPointRefundApproval(@RequestParam(value="pointRefundCode")String pointRefundCode,
										    Model model) {
		
		PointRefundApproval pointRefundApproval = pointRefundApprovalService.getPointRefundApprovalInfoByCode(pointRefundCode);

		model.addAttribute("title", "????????? ?????? ?????? ?????? ??????");
		model.addAttribute("pointRefundApprovalInfo", pointRefundApproval);
		
		return "admin/point/point_refund_approval_modify";
	}
	
	// ????????? ?????? ?????? ?????? ??????(??????)
	@GetMapping("/pointRefundApprovalList")
	public String pointRefundApprovalList(Model model
			 							,@RequestParam(value="searchKey", required = false) String searchKey
			 							,@RequestParam(value="searchValue", required = false, defaultValue = "") String searchValue){
		
		List<PointRefundApproval> pointRefundApprovalList = pointRefundApprovalService.PointRefundApprovalList(searchKey, searchValue);
		
		model.addAttribute("title", "????????? ?????? ?????? ?????? ??????");
		model.addAttribute("pointRefundApprovalList", pointRefundApprovalList);

		return "admin/point/point_refund_approval_list";
	}
	

	
	
//	  //????????? ??????/?????? ?????? ??????
//	  
//	  @GetMapping("/modifySaveUsePointList") 
//	  public String modifySaveUsePointList(Model model) {
//		  model.addAttribute("title","????????? ??????/?????? ?????? ??????");
//	  
//	  return "admin/point/point_save_use_modify"; 
//	  }
//	  
//	  //????????? ??????/?????? ?????? ??????
//	  
//	  @GetMapping("/deleteSaveUsePointList") 
//	  public String deleteSaveUsePointList(Model model) { 
//		  model.addAttribute("title",
//	  "????????? ??????/?????? ?????? ??????");
//	  
//	  return "admin/point/point_save_use_delete"; 
//	  }
//	 

}
