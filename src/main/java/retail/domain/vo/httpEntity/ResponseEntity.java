package retail.domain.vo.httpEntity;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.util.MultiValueMap;
import org.springframework.util.ObjectUtils;

/**
 * Created by LiuYu on 2016/6/14.
 */
public class ResponseEntity<T> extends HttpEntity<T>{
    private final HttpStatus statusCode;

    private int code;
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ResponseEntity(HttpStatus statusCode) {
        this.statusCode = statusCode;
    }

    public ResponseEntity(T body, HttpStatus statusCode) {
        super(body);
        this.statusCode = statusCode;
    }

    public ResponseEntity(MultiValueMap<String, String> headers, HttpStatus statusCode) {
        super(headers);
        this.statusCode = statusCode;
    }

    public ResponseEntity(T body, MultiValueMap<String, String> headers, HttpStatus statusCode) {
        super(body, headers);
        this.statusCode = statusCode;
    }

    public boolean equals(Object other) {
        if(this == other) {
            return true;
        } else if(other instanceof ResponseEntity && super.equals(other)) {
            ResponseEntity otherEntity = (ResponseEntity)other;
            return ObjectUtils.nullSafeEquals(this.statusCode, otherEntity.statusCode);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return super.hashCode() * 29 + ObjectUtils.nullSafeHashCode(this.statusCode);
    }

    public String toString() {
        StringBuilder builder = new StringBuilder("<");
        builder.append(this.statusCode.toString());
        builder.append(' ');
        builder.append(this.statusCode.getReasonPhrase());
        builder.append(',');
        Object body = this.getBody();
        if(body != null) {
            builder.append(body);
        }

        builder.append('>');
        return builder.toString();
    }
}
