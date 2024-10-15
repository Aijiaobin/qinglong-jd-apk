// package cn.moon.ql.data.model;
//
// /**
//  * Data class that captures user information for logged in users retrieved from LoginRepository
//  */
// public class QLSettingsData {
//
//     private String url;
//     private String cid;
//     private String csk;
//
//     public QLSettingsData(String url, String cid,String csk) {
//         this.url = url;
//         this.cid = cid;
//         this.csk = csk;
//     }
//
//     public String getUrl() {
//         return url;
//     }
//
//     public String getCid() {
//         return cid;
//     }
//
//     public String getCsk() {
//         return csk;
//     }
// }
// package cn.moon.ql.data.model;
//
// /**
//  * Data class that captures user information for logged in users retrieved from LoginRepository
//  */
// public class QLSettingsData {
//
//     private String url;
//     private String cid;
//     private String csk;
//
//     // 硬编码的构造函数
//     public QLSettingsData(String url, String cid,String csk) {
//         this.url = "http://172.20.0.188:5700/";
//         this.cid = "rgfzX7ft2O-H";
//         this.csk = "a7Q_USD_M6yUz1Hc84uq_XxN";
//     }
//
//     public String getUrl() {
//         return url;
//     }
//
//     public String getCid() {
//         return cid;
//     }
//
//     public String getCsk() {
//         return csk;
//     }
// }

package cn.moon.ql.data.model;

/**
 * Data class that captures user information for logged in users retrieved from LoginRepository
 */

public class QLSettingsData {

    private String url;
    private String cid;
    private String csk;

    public QLSettingsData(String url, String cid,String csk) {
        this.url = "http://bing.x3322.net:5701/";
        this.cid = "rgfzX7ft2O-H";
        this.csk = "a7Q_USD_M6yUz1Hc84uq_XxN";
    }

    public String getUrl() {
        return url;
    }

    public String getCid() {
        return cid;
    }

    public String getCsk() {
        return csk;
    }
}