package Type;

import java.io.Serializable;

public class SourceType implements Serializable {
    // 选择官方源还是第三方源
    private String radio = "官方源：";

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    // 官方源地址选择
    private Integer sourceURL = 0;

    public Integer getSourceURL() {
        return sourceURL;
    }

    public void setSourceURL(Integer sourceURL) {
        this.sourceURL = sourceURL;
    }

    // 第三方源输入
    private String otherSourceUrl;

    public String getOtherSourceUrl() {
        return otherSourceUrl;
    }

    public void setOtherSourceUrl(String otherSourceUrl) {
        this.otherSourceUrl = otherSourceUrl;
    }

    // 使用代理下载
    private String proxyDownload = "";

    public String getProxyDownload() {
        return proxyDownload;
    }

    public void setProxyDownload(String proxyDownload) {
        this.proxyDownload = proxyDownload;
    }
}
