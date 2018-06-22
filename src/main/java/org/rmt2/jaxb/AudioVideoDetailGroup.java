//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.22 at 03:47:49 PM CDT 
//


package org.rmt2.jaxb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.RMT2Base;


/**
 * <p>Java class for audio_video_detail_group complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="audio_video_detail_group">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="genre_details" type="{}audio_video_genre_lookup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="media_type_details" type="{}audio_video_media_type_lookup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="project_type_details" type="{}audio_video_project_type_lookup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="artist_details" type="{}audio_video_artist_info" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="project_details" type="{}audio_video_project_info" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="track_details" type="{}audio_video_track_info" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "audio_video_detail_group", propOrder = {
    "genreDetails",
    "mediaTypeDetails",
    "projectTypeDetails",
    "artistDetails",
    "projectDetails",
    "trackDetails"
})
public class AudioVideoDetailGroup
    extends RMT2Base
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "genre_details")
    protected List<AudioVideoGenreLookup> genreDetails;
    @XmlElement(name = "media_type_details")
    protected List<AudioVideoMediaTypeLookup> mediaTypeDetails;
    @XmlElement(name = "project_type_details")
    protected List<AudioVideoProjectTypeLookup> projectTypeDetails;
    @XmlElement(name = "artist_details")
    protected List<AudioVideoArtistInfo> artistDetails;
    @XmlElement(name = "project_details")
    protected List<AudioVideoProjectInfo> projectDetails;
    @XmlElement(name = "track_details")
    protected List<AudioVideoTrackInfo> trackDetails;

    /**
     * Gets the value of the genreDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the genreDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGenreDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudioVideoGenreLookup }
     * 
     * 
     */
    public List<AudioVideoGenreLookup> getGenreDetails() {
        if (genreDetails == null) {
            genreDetails = new ArrayList<AudioVideoGenreLookup>();
        }
        return this.genreDetails;
    }

    /**
     * Gets the value of the mediaTypeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mediaTypeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMediaTypeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudioVideoMediaTypeLookup }
     * 
     * 
     */
    public List<AudioVideoMediaTypeLookup> getMediaTypeDetails() {
        if (mediaTypeDetails == null) {
            mediaTypeDetails = new ArrayList<AudioVideoMediaTypeLookup>();
        }
        return this.mediaTypeDetails;
    }

    /**
     * Gets the value of the projectTypeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectTypeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjectTypeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudioVideoProjectTypeLookup }
     * 
     * 
     */
    public List<AudioVideoProjectTypeLookup> getProjectTypeDetails() {
        if (projectTypeDetails == null) {
            projectTypeDetails = new ArrayList<AudioVideoProjectTypeLookup>();
        }
        return this.projectTypeDetails;
    }

    /**
     * Gets the value of the artistDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the artistDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArtistDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudioVideoArtistInfo }
     * 
     * 
     */
    public List<AudioVideoArtistInfo> getArtistDetails() {
        if (artistDetails == null) {
            artistDetails = new ArrayList<AudioVideoArtistInfo>();
        }
        return this.artistDetails;
    }

    /**
     * Gets the value of the projectDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjectDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudioVideoProjectInfo }
     * 
     * 
     */
    public List<AudioVideoProjectInfo> getProjectDetails() {
        if (projectDetails == null) {
            projectDetails = new ArrayList<AudioVideoProjectInfo>();
        }
        return this.projectDetails;
    }

    /**
     * Gets the value of the trackDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trackDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrackDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudioVideoTrackInfo }
     * 
     * 
     */
    public List<AudioVideoTrackInfo> getTrackDetails() {
        if (trackDetails == null) {
            trackDetails = new ArrayList<AudioVideoTrackInfo>();
        }
        return this.trackDetails;
    }

}
