package nsk.tfoms.survay.util;

public class JsonResponse {
	private String status = null;
	private Object result = null;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Object getResult() {
		return result;
	}
	public void setResult(Object result) {
		this.result = result;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("JsonResponse [status=");
		builder.append(status);
		builder.append(", result=");
		builder.append(result);
		builder.append("]");
		return builder.toString();
	}
	
}
