package retail.domain.vo.httpEntity;

import org.springframework.http.HttpHeaders;
import org.springframework.util.MultiValueMap;
import org.springframework.util.ObjectUtils;

/**
 * Created by LiuYu on 2016/6/14.
 */
public class HttpEntity<T> {
    private final T body;

    protected HttpEntity() {
        this(null, (MultiValueMap)null);
    }

    public HttpEntity(T body) {
        this(body, (MultiValueMap)null);
    }

    public HttpEntity(MultiValueMap<String, String> headers) {
        this(null, headers);
    }

    public HttpEntity(T body, MultiValueMap<String, String> headers) {
        this.body = body;
        HttpHeaders tempHeaders = new HttpHeaders();
        if(headers != null) {
            tempHeaders.putAll(headers);
        }

    }

    public T getBody() {
        return this.body;
    }

    public boolean hasBody() {
        return this.body != null;
    }

    public boolean equals(Object other) {
        if(this == other) {
            return true;
        } else if(!(other instanceof HttpEntity)) {
            return false;
        } else {
            HttpEntity otherEntity = (HttpEntity)other;
            return ObjectUtils.nullSafeEquals(this.body, otherEntity.body);
        }
    }

    public int hashCode() {
        return ObjectUtils.nullSafeHashCode(this.body);
    }

    public String toString() {
        StringBuilder builder = new StringBuilder("<");
        if(this.body != null) {
            builder.append(this.body);
        }

        builder.append('>');
        return builder.toString();
    }
}
