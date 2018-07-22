/**
 * 
 */

var boardWrite = function() {
//	alert(document.frm_board.cNname.value);

	if (document.frm_board.cNname.value == null) {
		alert("로그인을 먼저 하세요.");
		document.location.href = "login";
		return;
		
	}  
		
	document.location.href = "boardWrite";
	
}