package ks45team04.sos.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ks45team04.sos.admin.dto.PointFeeRate;
import ks45team04.sos.admin.dto.PointRefundApproval;
import ks45team04.sos.admin.dto.PointSaveStandard;
import ks45team04.sos.admin.dto.PointSaveUse;
import ks45team04.sos.admin.mapper.PointFeeRateMapper;
import ks45team04.sos.admin.mapper.PointSaveStandardMapper;
import ks45team04.sos.admin.mapper.PointSaveUseMapper;
import ks45team04.sos.admin.service.PointFeeRateService;
import ks45team04.sos.admin.service.PointRefundApprovalService;
import ks45team04.sos.admin.service.PointSaveStandardService;
import ks45team04.sos.admin.service.PointSaveUseService;

@Controller
public class APointController {

	private final PointSaveUseService pointSaveUseService;
	private final PointSaveStandardService pointSaveStandardService;
	private final PointSaveStandardMapper pointSaveStandardMapper;
	private final PointFeeRateService pointFeeRateService;
	private final PointFeeRateMapper pointFeeRateMapper;
	private final PointRefundApprovalService pointRefundApprovalService;
	
	public APointController(PointSaveUseService pointSaveUseService, 
							PointSaveUseMapper pointSaveUseMapper , 
							PointSaveStandardService pointSaveStandardService,
							PointSaveStandardMapper pointSaveStandardMapper,
							PointFeeRateService pointFeeRateService,
							PointFeeRateMapper pointFeeRateMapper,
							PointRefundApprovalService pointRefundApprovalService) {
		
		this.pointSaveUseService = pointSaveUseService;
		this.pointSaveStandardService = pointSaveStandardService;
		this.pointSaveStandardMapper = pointSaveStandardMapper;
		this.pointFeeRateService = pointFeeRateService;
		this.pointFeeRateMapper = pointFeeRateMapper;
		this.pointRefundApprovalService = pointRefundApprovalService;
		
	}
	
	// 포인트 적립 기준 삭제
	@GetMapping("deletePointSaveStandard")
	public String deletePointSaveStandard(Model model) {
		model.addAttribute("title", "포인트 적립 기준 삭제");

		return "admin/point/point_save_standard_delete";
	}
	
	//포인트 적립 기준 수정 처리
	@PostMapping("/modifyPointSaveStandard")
	public String modifyPointSaveStandard(PointSaveStandard pointSaveStandard) {
		
		pointSaveStandardService.modifyPointSaveStandard(pointSaveStandard);
		
		return "redirect:/pointSaveStandardList";
	}
	
	
	// 포인트 적립 기준 수정 화면
	@GetMapping("/modifyPointSaveStandard")
	public String modifyPointSaveStandard(@RequestParam(value="pointSaveStandardCode") String pointSaveStandardCode
										  ,Model model) {
		
		PointSaveStandard pointSaveStandard = pointSaveStandardService.getPointSaveStandardInfoByCode(pointSaveStandardCode);
		
		model.addAttribute("title", "포인트 적립 기준 수정");
		model.addAttribute("pointSaveStandardInfo", pointSaveStandard);

		return "admin/point/point_save_standard_modify";
	}
	
	//포인트 적립 기준 등록 관리자 인증
	@GetMapping("/pointSaveStandardIdCheck")
	@ResponseBody
	public boolean pointSaveStandardIdCheck(@RequestParam(value="inputId") String inputId){
		
		boolean isChecked = pointSaveStandardMapper.getPointSaveStandardIdCheck(inputId);
		
		return isChecked;
	}
	
	//포인트 수수율 등록 관리자 인증
	@GetMapping("/pointFeeRateIdCheck")
	@ResponseBody
	public boolean pointFeeRateIdCheck(@RequestParam(value="inputId") String inputId){
	
		boolean isChecked = pointFeeRateMapper.getPointFeeRateIdCheck(inputId);
		
		return isChecked;
	}

	// 포인트 적립 기준 등록 처리
	@PostMapping("/addpointSaveStandard")
	public String addPointSaveStandard(PointSaveStandard PointSaveStandard) {
		System.out.println(PointSaveStandard);
		pointSaveStandardService.addPointSaveStandard(PointSaveStandard);
		
		return "redirect:/pointSaveStandardList";
	}
	
	
	// 포인트 적립 기준 등록 화면
	@GetMapping("/addPointSaveStandard")
	public String addPointSaveStandard(Model model) {
		
		List<PointSaveStandard> pointSaveStandardList = pointSaveStandardMapper.pointSaveStandardList();
		
		model.addAttribute("title", "포인트 적립 기준 등록");
		model.addAttribute("pointSaveStandardList", pointSaveStandardList);
		
		return "admin/point/point_save_standard_insert";
	}
	
	// 포인트 수수료율 등록 처리
	@PostMapping("/addPointFeeRate")
	public String addPointFeeRate(PointFeeRate PointFeeRate) {
		System.out.println(PointFeeRate);
		pointFeeRateService.addPointFeeRate(PointFeeRate);
		
		return "redirect:/pointFeeRateList";
			}
	
	// 포인트 수수료율 등록 화면
	@GetMapping("/addPointFeeRate")
	public String addPointFeeRate(Model model) {
		
		List<PointFeeRate> pointFeeRateList = pointFeeRateMapper.pointFeeRateList();
		
		model.addAttribute("title", "포인트 수수료율 등록");
		model.addAttribute("pointFeeRateList",pointFeeRateList);

		return "admin/point/point_fee_rate_insert";
	}
	
	// 포인트 적립 기준 조회
	@GetMapping("/pointSaveStandardList")
	public String pointSaveStandardList(Model model) {
		
		List<PointSaveStandard> pointSaveStandardList = pointSaveStandardService.PointSaveStandardList();

		model.addAttribute("title", "포인트 적립 기준 조회");
		model.addAttribute("pointSaveStandardList", pointSaveStandardList);
		
		return "admin/point/point_save_standard_list";
	}
	
	// 포인트 환급 승인 내역 조회
	@GetMapping("/pointRefundApprovalList")
	public String pointRefundApprovalList(Model model) {
		
		List<PointRefundApproval> pointRefundApprovalList = pointRefundApprovalService.PointRefundApprovalList();
		
		model.addAttribute("title", "포인트 환급 승인 내역 조회");
		model.addAttribute("pointRefundApprovalList", pointRefundApprovalList);

		return "admin/point/point_refund_approval_list";
	}
	
	// 포인트 수수료율 조회
	@GetMapping("/pointFeeRateList")
	public String pointFeeRateList(Model model) {
			
		List<PointFeeRate> pointFeeRateList = pointFeeRateService.PointFeeRateList();
			
		model.addAttribute("title", "포인트 수수료율 조회");
		model.addAttribute("pointFeeRateList", pointFeeRateList);

		return "admin/point/point_fee_rate_list";
	}



	// 포인트 수수료율 수정
	@GetMapping("/modifyPointfeeRate")
	public String modifyPointfeeRate(Model model) {
		model.addAttribute("title", "포인트 수수료율 수정");

		return "admin/point/point_fee_rate_modify";
	}

	// 포인트 수수료율 삭제
	@GetMapping("/deletePointfeeRate")
	public String deletePointfeeRate(Model model) {
		model.addAttribute("title", "포인트 수수료율 삭제");

		return "admin/point/point_fee_rate_delete";
	}

	
	// 포인트 적립 등록
	@GetMapping("/pointSaveUsePointAdd")
	public String pointSaveUsePointAdd(Model model) {
		model.addAttribute("title", "포인트 적립 등록");

		return "admin/point/point_save_use_add";
	}

	// 포인트 적립/사용 내역 조회
	@GetMapping("/pointSaveUseList")
	public String pointSaveUseList(Model model) {

		List<PointSaveUse> pointSaveUseList = pointSaveUseService.PointSaveUseList();

		model.addAttribute("title", "포인트 적립/사용 내역 조회");
		model.addAttribute("pointSaveUseList", pointSaveUseList);

		return "admin/point/point_save_use_list";
	}



	
	// 포인트 환급 승인 내역 수정
	@GetMapping("/modifyPointRefundApproval")
	public String modifyPointRefundApproval(Model model) {
		model.addAttribute("title", "포인트 환급 승인 내역 수정");

		return "admin/point/point_refund_approval_modify";
	}
	
	// 포인트 환급 승인 내역 삭제
	@GetMapping("/deletePointRefundApproval")
	public String deletePointRefundApproval(Model model) {
		model.addAttribute("title", "포인트 환급 승인 내역 삭제");

		return "admin/point/point_refund_approval_delete";
	}
	
	
//	  //포인트 적립/사용 내역 수정
//	  
//	  @GetMapping("/modifySaveUsePointList") 
//	  public String modifySaveUsePointList(Model model) {
//		  model.addAttribute("title","포인트 적립/사용 내역 수정");
//	  
//	  return "admin/point/point_save_use_modify"; 
//	  }
//	  
//	  //포인트 적립/사용 내역 삭제
//	  
//	  @GetMapping("/deleteSaveUsePointList") 
//	  public String deleteSaveUsePointList(Model model) { 
//		  model.addAttribute("title",
//	  "포인트 적립/사용 내역 삭제");
//	  
//	  return "admin/point/point_save_use_delete"; 
//	  }
//	 

}
