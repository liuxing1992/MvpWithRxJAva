package com.tubban.myrxmvpwithcache.bean;

import java.util.List;

/**
 * Created by liu_yao on 2016/12/7.
 */

public class ProductBean {

    private int code;
    private DataBeanX data;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBeanX getData() {
        return data;
    }

    public void setData(DataBeanX data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static class DataBeanX {


        private PagingBean paging;
        private List<ItemsBean> items;

        public PagingBean getPaging() {
            return paging;
        }

        public void setPaging(PagingBean paging) {
            this.paging = paging;
        }

        public List<ItemsBean> getItems() {
            return items;
        }

        public void setItems(List<ItemsBean> items) {
            this.items = items;
        }

        public static class PagingBean {
            /**
             * next_url : http://api.dantangapp.com/v2/items?generation=1&gender=1&limit=20&offset=20
             */

            private String next_url;

            public String getNext_url() {
                return next_url;
            }

            public void setNext_url(String next_url) {
                this.next_url = next_url;
            }
        }

        public static class ItemsBean {
            /**
             * data : {"brand_id":null,"brand_order":0,"category_id":null,"cover_image_url":"http://7fvaoh.com3.z0.glb.qiniucdn.com/image/150819/a7wjwjck3_w.jpg-w720","created_at":1439952881,"description":"开关一键式，便携又防漏，热水氤氲的湿气打在脸上，温暖又可爱~","editor_id":1037,"favorites_count":197,"id":1355,"image_urls":["http://7fvaoh.com3.z0.glb.qiniucdn.com/image/150819/ovabcvdgu.jpg-w720","http://7fvaoh.com3.z0.glb.qiniucdn.com/image/150819/gaw35u5bt.jpg-w720","http://7fvaoh.com3.z0.glb.qiniucdn.com/image/150819/q8t6cumc8.jpg-w720","http://7fvaoh.com3.z0.glb.qiniucdn.com/image/150819/725ba3h13.jpg-w720","http://7fvaoh.com3.z0.glb.qiniucdn.com/image/150819/n482l8tkb.jpg-w720","http://7fvaoh.com3.z0.glb.qiniucdn.com/image/150819/a7wjwjck3_w.jpg-w720"],"is_favorite":false,"name":"不锈钢保温杯","post_ids":[],"price":"58.00","purchase_id":"43879526968","purchase_status":1,"purchase_type":2,"purchase_url":"http://s.click.taobao.com/t?e=m%3D2%26s%3DYxYY5WFio4EcQipKwQzePOeEDrYVVa64pRe%2F8jaAHci5VBFTL4hn2ZzpsqmXu%2FE9WI6w0dMGH8htabAtTg06px%2FVXctKptzdeP1OMBEVuKXSfUtBr7Z5QILBwQLXKLHMyxRpeaHkj4I49d%2BuVtoyMHEqY%2Bakgpmw","subcategory_id":null,"updated_at":1439952881,"url":"http://dantang.liwushuo.com/items/1355"}
             * type : item
             */

            private DataBean data;
            private String type;

            public DataBean getData() {
                return data;
            }

            public void setData(DataBean data) {
                this.data = data;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public static class DataBean {
                /**
                 * brand_id : null
                 * brand_order : 0
                 * category_id : null
                 * cover_image_url : http://7fvaoh.com3.z0.glb.qiniucdn.com/image/150819/a7wjwjck3_w.jpg-w720
                 * created_at : 1439952881
                 * description : 开关一键式，便携又防漏，热水氤氲的湿气打在脸上，温暖又可爱~
                 * editor_id : 1037
                 * favorites_count : 197
                 * id : 1355
                 * image_urls : ["http://7fvaoh.com3.z0.glb.qiniucdn.com/image/150819/ovabcvdgu.jpg-w720","http://7fvaoh.com3.z0.glb.qiniucdn.com/image/150819/gaw35u5bt.jpg-w720","http://7fvaoh.com3.z0.glb.qiniucdn.com/image/150819/q8t6cumc8.jpg-w720","http://7fvaoh.com3.z0.glb.qiniucdn.com/image/150819/725ba3h13.jpg-w720","http://7fvaoh.com3.z0.glb.qiniucdn.com/image/150819/n482l8tkb.jpg-w720","http://7fvaoh.com3.z0.glb.qiniucdn.com/image/150819/a7wjwjck3_w.jpg-w720"]
                 * is_favorite : false
                 * name : 不锈钢保温杯
                 * post_ids : []
                 * price : 58.00
                 * purchase_id : 43879526968
                 * purchase_status : 1
                 * purchase_type : 2
                 * purchase_url : http://s.click.taobao.com/t?e=m%3D2%26s%3DYxYY5WFio4EcQipKwQzePOeEDrYVVa64pRe%2F8jaAHci5VBFTL4hn2ZzpsqmXu%2FE9WI6w0dMGH8htabAtTg06px%2FVXctKptzdeP1OMBEVuKXSfUtBr7Z5QILBwQLXKLHMyxRpeaHkj4I49d%2BuVtoyMHEqY%2Bakgpmw
                 * subcategory_id : null
                 * updated_at : 1439952881
                 * url : http://dantang.liwushuo.com/items/1355
                 */

                private Object brand_id;
                private int brand_order;
                private Object category_id;
                private String cover_image_url;
                private int created_at;
                private String description;
                private int editor_id;
                private int favorites_count;
                private int id;
                private boolean is_favorite;
                private String name;
                private String price;
                private String purchase_id;
                private int purchase_status;
                private int purchase_type;
                private String purchase_url;
                private Object subcategory_id;
                private int updated_at;
                private String url;
                private List<String> image_urls;
                private List<?> post_ids;

                public Object getBrand_id() {
                    return brand_id;
                }

                public void setBrand_id(Object brand_id) {
                    this.brand_id = brand_id;
                }

                public int getBrand_order() {
                    return brand_order;
                }

                public void setBrand_order(int brand_order) {
                    this.brand_order = brand_order;
                }

                public Object getCategory_id() {
                    return category_id;
                }

                public void setCategory_id(Object category_id) {
                    this.category_id = category_id;
                }

                public String getCover_image_url() {
                    return cover_image_url;
                }

                public void setCover_image_url(String cover_image_url) {
                    this.cover_image_url = cover_image_url;
                }

                public int getCreated_at() {
                    return created_at;
                }

                public void setCreated_at(int created_at) {
                    this.created_at = created_at;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public int getEditor_id() {
                    return editor_id;
                }

                public void setEditor_id(int editor_id) {
                    this.editor_id = editor_id;
                }

                public int getFavorites_count() {
                    return favorites_count;
                }

                public void setFavorites_count(int favorites_count) {
                    this.favorites_count = favorites_count;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public boolean isIs_favorite() {
                    return is_favorite;
                }

                public void setIs_favorite(boolean is_favorite) {
                    this.is_favorite = is_favorite;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getPrice() {
                    return price;
                }

                public void setPrice(String price) {
                    this.price = price;
                }

                public String getPurchase_id() {
                    return purchase_id;
                }

                public void setPurchase_id(String purchase_id) {
                    this.purchase_id = purchase_id;
                }

                public int getPurchase_status() {
                    return purchase_status;
                }

                public void setPurchase_status(int purchase_status) {
                    this.purchase_status = purchase_status;
                }

                public int getPurchase_type() {
                    return purchase_type;
                }

                public void setPurchase_type(int purchase_type) {
                    this.purchase_type = purchase_type;
                }

                public String getPurchase_url() {
                    return purchase_url;
                }

                public void setPurchase_url(String purchase_url) {
                    this.purchase_url = purchase_url;
                }

                public Object getSubcategory_id() {
                    return subcategory_id;
                }

                public void setSubcategory_id(Object subcategory_id) {
                    this.subcategory_id = subcategory_id;
                }

                public int getUpdated_at() {
                    return updated_at;
                }

                public void setUpdated_at(int updated_at) {
                    this.updated_at = updated_at;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public List<String> getImage_urls() {
                    return image_urls;
                }

                public void setImage_urls(List<String> image_urls) {
                    this.image_urls = image_urls;
                }

                public List<?> getPost_ids() {
                    return post_ids;
                }

                public void setPost_ids(List<?> post_ids) {
                    this.post_ids = post_ids;
                }
            }
        }
    }
}
