package io.github.atimothee.rocketsolution.data;

import android.media.Image;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import io.github.atimothee.rocketsolution.data.Data;


public class Response {

    @Expose
    private Boolean success;
    @Expose
    private Metadata metadata;

    /**
     * @return The success
     */
    public Boolean getSuccess() {
        return success;
    }

    /**
     * @param success The success
     */
    public void setSuccess(Boolean success) {
        this.success = success;
    }


    /**
     * @return The metadata
     */
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * @param metadata The metadata
     */
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }


    public class Metadata {
        @Expose
        private List<Result> results = new ArrayList<Result>();

        /**
         * @return The results
         */
        public List<Result> getResults() {
            return results;
        }

        /**
         * @param results The results
         */
        public void setResults(List<Result> results) {
            this.results = results;
        }


    }

    public class Result {

        @Expose
        private String id;
        @Expose
        private Data data;
        @Expose
        private List<Image> images = new ArrayList<Image>();

        /**
         * @return The id
         */
        public String getId() {
            return id;
        }

        /**
         * @param id The id
         */
        public void setId(String id) {
            this.id = id;
        }

        /**
         * @return The data
         */
        public Data getData() {
            return data;
        }

        /**
         * @param data The data
         */
        public void setData(Data data) {
            this.data = data;
        }

        /**
         * @return The images
         */
        public List<Image> getImages() {
            return images;
        }

        /**
         * @param images The images
         */
        public void setImages(List<Image> images) {
            this.images = images;
        }

    }

    public class Image {

        @Expose
        private String path;
        @Expose
        private String format;
        @Expose
        private String width;
        @Expose
        private String height;
        @SerializedName("default")
        @Expose
        private Boolean _default;

        /**
         *
         * @return
         * The path
         */
        public String getPath() {
            return path;
        }

        /**
         *
         * @param path
         * The path
         */
        public void setPath(String path) {
            this.path = path;
        }

        /**
         *
         * @return
         * The format
         */
        public String getFormat() {
            return format;
        }

        /**
         *
         * @param format
         * The format
         */
        public void setFormat(String format) {
            this.format = format;
        }

        /**
         *
         * @return
         * The width
         */
        public String getWidth() {
            return width;
        }

        /**
         *
         * @param width
         * The width
         */
        public void setWidth(String width) {
            this.width = width;
        }

        /**
         *
         * @return
         * The height
         */
        public String getHeight() {
            return height;
        }

        /**
         *
         * @param height
         * The height
         */
        public void setHeight(String height) {
            this.height = height;
        }

        /**
         *
         * @return
         * The _default
         */
        public Boolean getDefault() {
            return _default;
        }

        /**
         *
         * @param _default
         * The default
         */
        public void setDefault(Boolean _default) {
            this._default = _default;
        }

    }
}