/*
 * 
 * Copyright 2014 Mauricio "Maltron" Leal <maltron@gmail.com>
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package net.nortlam.samle.location.tooling;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;
import net.nortlam.samle.commons.util.Parse;

/**
 *
 * @author Mauricio "Maltron" Leal */
public class Import implements Serializable {

    private static final Logger LOG = Logger.getLogger(Import.class.getName());
    
    public static final String WEBSITE = "http://en.wikipedia.org/wiki/ISO_3166-1";
    
    public static final String TESTING = "<!DOCTYPE html>\n" +
"<html lang=\"en\" dir=\"ltr\" class=\"client-nojs\">\n" +
"<head>\n" +
"<meta charset=\"UTF-8\" />\n" +
"<title>ISO 3166-1 - Wikipedia, the free encyclopedia</title>\n" +
"<meta name=\"generator\" content=\"MediaWiki 1.25wmf17\" />\n" +
"<link rel=\"alternate\" href=\"android-app://org.wikipedia/http/en.m.wikipedia.org/wiki/ISO_3166-1\" />\n" +
"<link rel=\"alternate\" type=\"application/x-wiki\" title=\"Edit this page\" href=\"/w/index.php?title=ISO_3166-1&amp;action=edit\" />\n" +
"<link rel=\"edit\" title=\"Edit this page\" href=\"/w/index.php?title=ISO_3166-1&amp;action=edit\" />\n" +
"<link rel=\"apple-touch-icon\" href=\"//bits.wikimedia.org/apple-touch/wikipedia.png\" />\n" +
"<link rel=\"shortcut icon\" href=\"//bits.wikimedia.org/favicon/wikipedia.ico\" />\n" +
"<link rel=\"search\" type=\"application/opensearchdescription+xml\" href=\"/w/opensearch_desc.php\" title=\"Wikipedia (en)\" />\n" +
"<link rel=\"EditURI\" type=\"application/rsd+xml\" href=\"//en.wikipedia.org/w/api.php?action=rsd\" />\n" +
"<link rel=\"alternate\" hreflang=\"x-default\" href=\"/wiki/ISO_3166-1\" />\n" +
"<link rel=\"copyright\" href=\"//creativecommons.org/licenses/by-sa/3.0/\" />\n" +
"<link rel=\"alternate\" type=\"application/atom+xml\" title=\"Wikipedia Atom feed\" href=\"/w/index.php?title=Special:RecentChanges&amp;feed=atom\" />\n" +
"<link rel=\"canonical\" href=\"http://en.wikipedia.org/wiki/ISO_3166-1\" />\n" +
"<link rel=\"stylesheet\" href=\"//bits.wikimedia.org/en.wikipedia.org/load.php?debug=false&amp;lang=en&amp;modules=ext.gadget.DRN-wizard%2CReferenceTooltips%2Ccharinsert%2Cfeatured-articles-links%2CrefToolbar%2Cswitcher%2Cteahouse%7Cext.rtlcite%2Cwikihiero%2CwikimediaBadges%7Cext.uls.nojs%7Cext.visualEditor.viewPageTarget.noscript%7Cmediawiki.legacy.commonPrint%2Cshared%7Cmediawiki.skinning.interface%7Cmediawiki.ui.button%7Cskins.vector.styles%7Cwikibase.client.init&amp;only=styles&amp;skin=vector&amp;*\" />\n" +
"<meta name=\"ResourceLoaderDynamicStyles\" content=\"\" />\n" +
"<link rel=\"stylesheet\" href=\"//bits.wikimedia.org/en.wikipedia.org/load.php?debug=false&amp;lang=en&amp;modules=site&amp;only=styles&amp;skin=vector&amp;*\" />\n" +
"<style>a:lang(ar),a:lang(kk-arab),a:lang(mzn),a:lang(ps),a:lang(ur){text-decoration:none}\n" +
"/* cache key: enwiki:resourceloader:filter:minify-css:7:3904d24a08aa08f6a68dc338f9be277e */</style>\n" +
"<script src=\"//bits.wikimedia.org/en.wikipedia.org/load.php?debug=false&amp;lang=en&amp;modules=startup&amp;only=scripts&amp;skin=vector&amp;*\"></script>\n" +
"<script>if(window.mw){\n" +
"mw.config.set({\"wgCanonicalNamespace\":\"\",\"wgCanonicalSpecialPageName\":false,\"wgNamespaceNumber\":0,\"wgPageName\":\"ISO_3166-1\",\"wgTitle\":\"ISO 3166-1\",\"wgCurRevisionId\":646770742,\"wgRevisionId\":646770742,\"wgArticleId\":222771,\"wgIsArticle\":true,\"wgIsRedirect\":false,\"wgAction\":\"view\",\"wgUserName\":null,\"wgUserGroups\":[\"*\"],\"wgCategories\":[\"CS1 German-language sources (de)\",\"CS1 French-language sources (fr)\",\"Featured lists\",\"ISO 3166\",\"Lists of countries\",\"Country codes\"],\"wgBreakFrames\":false,\"wgPageContentLanguage\":\"en\",\"wgPageContentModel\":\"wikitext\",\"wgSeparatorTransformTable\":[\"\",\"\"],\"wgDigitTransformTable\":[\"\",\"\"],\"wgDefaultDateFormat\":\"dmy\",\"wgMonthNames\":[\"\",\"January\",\"February\",\"March\",\"April\",\"May\",\"June\",\"July\",\"August\",\"September\",\"October\",\"November\",\"December\"],\"wgMonthNamesShort\":[\"\",\"Jan\",\"Feb\",\"Mar\",\"Apr\",\"May\",\"Jun\",\"Jul\",\"Aug\",\"Sep\",\"Oct\",\"Nov\",\"Dec\"],\"wgRelevantPageName\":\"ISO_3166-1\",\"wgRelevantArticleId\":222771,\"wgIsProbablyEditable\":true,\"wgRestrictionEdit\":[],\"wgRestrictionMove\":[],\"wgWikiEditorEnabledModules\":{\"toolbar\":true,\"dialogs\":true,\"hidesig\":true,\"preview\":false,\"publish\":false},\"wgBetaFeaturesFeatures\":[],\"wgMediaViewerOnClick\":true,\"wgMediaViewerEnabledByDefault\":true,\"wgVisualEditor\":{\"pageLanguageCode\":\"en\",\"pageLanguageDir\":\"ltr\",\"svgMaxSize\":4096,\"namespacesWithSubpages\":{\"6\":0,\"8\":0,\"1\":true,\"2\":true,\"3\":true,\"4\":true,\"5\":true,\"7\":true,\"9\":true,\"10\":true,\"11\":true,\"12\":true,\"13\":true,\"14\":true,\"15\":true,\"100\":true,\"101\":true,\"102\":true,\"103\":true,\"104\":true,\"105\":true,\"106\":true,\"107\":true,\"108\":true,\"109\":true,\"110\":true,\"111\":true,\"830\":true,\"831\":true,\"447\":true,\"2600\":false,\"828\":true,\"829\":true}},\"wikilove-recipient\":\"\",\"wikilove-anon\":0,\"wgPoweredByHHVM\":true,\"wgULSAcceptLanguageList\":[\"en-us\",\"fr-fr\"],\"wgULSCurrentAutonym\":\"English\",\"wgFlaggedRevsParams\":{\"tags\":{\"status\":{\"levels\":1,\"quality\":2,\"pristine\":3}}},\"wgStableRevisionId\":null,\"wgCategoryTreePageCategoryOptions\":\"{\\\"mode\\\":0,\\\"hideprefix\\\":20,\\\"showcount\\\":true,\\\"namespaces\\\":false}\",\"wgNoticeProject\":\"wikipedia\",\"wgWikibaseItemId\":\"Q25275\"});\n" +
"}</script><script>if(window.mw){\n" +
"mw.loader.implement(\"user.options\",function($,jQuery){mw.user.options.set({\"variant\":\"en\"});},{},{},{});mw.loader.implement(\"user.tokens\",function($,jQuery){mw.user.tokens.set({\"editToken\":\"+\\\\\",\"patrolToken\":\"+\\\\\",\"watchToken\":\"+\\\\\"});},{},{},{});\n" +
"/* cache key: enwiki:resourceloader:filter:minify-js:7:94007ea073e20ad4a3cdce36b2f2e369 */\n" +
"}</script>\n" +
"<script>if(window.mw){\n" +
"mw.loader.load([\"mediawiki.page.startup\",\"mediawiki.legacy.wikibits\",\"mediawiki.legacy.ajax\",\"ext.centralauth.centralautologin\",\"mmv.head\",\"ext.visualEditor.viewPageTarget.init\",\"ext.uls.init\",\"ext.uls.interface\",\"ext.centralNotice.bannerController\",\"skins.vector.js\"]);\n" +
"}</script>\n" +
"<link rel=\"dns-prefetch\" href=\"//meta.wikimedia.org\" />\n" +
"<!--[if lt IE 7]><style type=\"text/css\">body{behavior:url(\"/w/static-1.25wmf17/skins/Vector/csshover.min.htc\")}</style><![endif]-->\n" +
"</head>\n" +
"<body class=\"mediawiki ltr sitedir-ltr ns-0 ns-subject page-ISO_3166-1 skin-vector action-view\">\n" +
"		<div id=\"mw-page-base\" class=\"noprint\"></div>\n" +
"		<div id=\"mw-head-base\" class=\"noprint\"></div>\n" +
"		<div id=\"content\" class=\"mw-body\" role=\"main\">\n" +
"			<a id=\"top\"></a>\n" +
"\n" +
"							<div id=\"siteNotice\"><!-- CentralNotice --></div>\n" +
"						<div class=\"mw-indicators\">\n" +
"</div>\n" +
"			<h1 id=\"firstHeading\" class=\"firstHeading\" lang=\"en\">ISO 3166-1</h1>\n" +
"						<div id=\"bodyContent\" class=\"mw-body-content\">\n" +
"									<div id=\"siteSub\">From Wikipedia, the free encyclopedia</div>\n" +
"								<div id=\"contentSub\"></div>\n" +
"												<div id=\"jump-to-nav\" class=\"mw-jump\">\n" +
"					Jump to:					<a href=\"#mw-head\">navigation</a>, 					<a href=\"#p-search\">search</a>\n" +
"				</div>\n" +
"				<div id=\"mw-content-text\" lang=\"en\" dir=\"ltr\" class=\"mw-content-ltr\"><p><b>ISO 3166-1</b> is part of the <a href=\"/wiki/ISO_3166\" title=\"ISO 3166\">ISO 3166</a> <a href=\"/wiki/Standardization\" title=\"Standardization\">standard</a> published by the <a href=\"/wiki/International_Organization_for_Standardization\" title=\"International Organization for Standardization\">International Organization for Standardization</a> (ISO), and defines <a href=\"/wiki/Code\" title=\"Code\">codes</a> for the names of <a href=\"/wiki/Country\" title=\"Country\">countries</a>, <a href=\"/wiki/Dependent_territory\" title=\"Dependent territory\">dependent territories</a>, and special areas of geographical interest. The official name of the standard is <i>Codes for the representation of names of countries and their subdivisions – Part 1: Country codes</i>. It defines three sets of <a href=\"/wiki/Country_code\" title=\"Country code\">country codes</a>:<sup id=\"cite_ref-1\" class=\"reference\"><a href=\"#cite_note-1\"><span>[</span>1<span>]</span></a></sup></p>\n" +
"<ul>\n" +
"<li><a href=\"/wiki/ISO_3166-1_alpha-2\" title=\"ISO 3166-1 alpha-2\">ISO 3166-1 alpha-2</a> – two-letter country codes which are the most widely used of the three, and used most prominently for the <a href=\"/wiki/Internet\" title=\"Internet\">Internet</a>'s <a href=\"/wiki/Country_code_top-level_domain\" title=\"Country code top-level domain\">country code top-level domains</a> (with a few exceptions).</li>\n" +
"<li><a href=\"/wiki/ISO_3166-1_alpha-3\" title=\"ISO 3166-1 alpha-3\">ISO 3166-1 alpha-3</a> – three-letter country codes which allow a better visual association between the codes and the country names than the alpha-2 codes.</li>\n" +
"<li><a href=\"/wiki/ISO_3166-1_numeric\" title=\"ISO 3166-1 numeric\">ISO 3166-1 numeric</a> – three-digit country codes which are identical to those developed and maintained by the <a href=\"/wiki/United_Nations_Statistics_Division\" title=\"United Nations Statistics Division\">United Nations Statistics Division</a>, with the advantage of script (<a href=\"/wiki/Writing_system\" title=\"Writing system\">writing system</a>) independence, and hence useful for people or systems using non-<a href=\"/wiki/Latin_alphabet\" title=\"Latin alphabet\">Latin</a> scripts.</li>\n" +
"</ul>\n" +
"<p>The alphabetic country codes were first included in ISO 3166 in 1974, and the numeric country codes were first included in 1981. The country codes have been published as ISO 3166-1 since 1997, when ISO 3166 was expanded into three parts, with <a href=\"/wiki/ISO_3166-2\" title=\"ISO 3166-2\">ISO 3166-2</a> defining codes for <a href=\"/wiki/Administrative_division\" title=\"Administrative division\">subdivisions</a> and <a href=\"/wiki/ISO_3166-3\" title=\"ISO 3166-3\">ISO 3166-3</a> defining codes for <a href=\"/wiki/List_of_former_sovereign_states\" title=\"List of former sovereign states\">former countries</a>.<sup id=\"cite_ref-2\" class=\"reference\"><a href=\"#cite_note-2\"><span>[</span>2<span>]</span></a></sup></p>\n" +
"<p>As a widely used international standard, ISO 3166-1 is implemented in other standards and used by <a href=\"/wiki/International_organization\" title=\"International organization\">international organizations</a><sup id=\"cite_ref-3\" class=\"reference\"><a href=\"#cite_note-3\"><span>[</span>3<span>]</span></a></sup> to allow facilitation of the exchange of goods and information.<sup id=\"cite_ref-4\" class=\"reference\"><a href=\"#cite_note-4\"><span>[</span>4<span>]</span></a></sup> However, it is not the only standard for country codes. <a href=\"/wiki/Country_code#Other_country_codes\" title=\"Country code\">Other country codes</a> used by many international organizations are partly or totally incompatible with ISO 3166-1,<sup id=\"cite_ref-5\" class=\"reference\"><a href=\"#cite_note-5\"><span>[</span>5<span>]</span></a></sup> although some of them closely correspond to ISO 3166-1 codes.</p>\n" +
"<p></p>\n" +
"<div id=\"toc\" class=\"toc\">\n" +
"<div id=\"toctitle\">\n" +
"<h2>Contents</h2>\n" +
"</div>\n" +
"<ul>\n" +
"<li class=\"toclevel-1 tocsection-1\"><a href=\"#Criteria_for_inclusion\"><span class=\"tocnumber\">1</span> <span class=\"toctext\">Criteria for inclusion</span></a></li>\n" +
"<li class=\"toclevel-1 tocsection-2\"><a href=\"#Naming_and_code_construction\"><span class=\"tocnumber\">2</span> <span class=\"toctext\">Naming and code construction</span></a></li>\n" +
"<li class=\"toclevel-1 tocsection-3\"><a href=\"#Information_included\"><span class=\"tocnumber\">3</span> <span class=\"toctext\">Information included</span></a></li>\n" +
"<li class=\"toclevel-1 tocsection-4\"><a href=\"#Current_codes\"><span class=\"tocnumber\">4</span> <span class=\"toctext\">Current codes</span></a>\n" +
"<ul>\n" +
"<li class=\"toclevel-2 tocsection-5\"><a href=\"#Officially_assigned_code_elements\"><span class=\"tocnumber\">4.1</span> <span class=\"toctext\">Officially assigned code elements</span></a></li>\n" +
"<li class=\"toclevel-2 tocsection-6\"><a href=\"#Reserved_and_user-assigned_code_elements\"><span class=\"tocnumber\">4.2</span> <span class=\"toctext\">Reserved and user-assigned code elements</span></a></li>\n" +
"</ul>\n" +
"</li>\n" +
"<li class=\"toclevel-1 tocsection-7\"><a href=\"#Changes\"><span class=\"tocnumber\">5</span> <span class=\"toctext\">Changes</span></a></li>\n" +
"<li class=\"toclevel-1 tocsection-8\"><a href=\"#See_also\"><span class=\"tocnumber\">6</span> <span class=\"toctext\">See also</span></a></li>\n" +
"<li class=\"toclevel-1 tocsection-9\"><a href=\"#References\"><span class=\"tocnumber\">7</span> <span class=\"toctext\">References</span></a></li>\n" +
"<li class=\"toclevel-1 tocsection-10\"><a href=\"#Sources_and_external_links\"><span class=\"tocnumber\">8</span> <span class=\"toctext\">Sources and external links</span></a></li>\n" +
"</ul>\n" +
"</div>\n" +
"<p></p>\n" +
"<h2><span class=\"mw-headline\" id=\"Criteria_for_inclusion\">Criteria for inclusion</span><span class=\"mw-editsection\"><span class=\"mw-editsection-bracket\">[</span><a href=\"/w/index.php?title=ISO_3166-1&amp;action=edit&amp;section=1\" title=\"Edit section: Criteria for inclusion\">edit</a><span class=\"mw-editsection-bracket\">]</span></span></h2>\n" +
"<p>Currently 249 countries, territories, or areas of geographical interest are assigned official codes in ISO 3166-1. According to the ISO 3166 Maintenance Agency (ISO 3166/MA), the only way to enter a new country name into ISO 3166-1 is to have it registered in one of the following two sources:<sup id=\"cite_ref-6\" class=\"reference\"><a href=\"#cite_note-6\"><span>[</span>6<span>]</span></a></sup></p>\n" +
"<ul>\n" +
"<li><a href=\"/wiki/United_Nations\" title=\"United Nations\">United Nations</a> Terminology Bulletin <i>Country Names</i>, or</li>\n" +
"<li><i>Country and Region Codes for Statistical Use</i> of the UN Statistics Division.</li>\n" +
"</ul>\n" +
"<p>To be listed in the bulletin <i>Country Names</i>, a country must be at least one of the following:<sup id=\"cite_ref-7\" class=\"reference\"><a href=\"#cite_note-7\"><span>[</span>7<span>]</span></a></sup></p>\n" +
"<ul>\n" +
"<li>A <a href=\"/wiki/United_Nations_member_states\" title=\"United Nations member states\" class=\"mw-redirect\">member state of the United Nations</a></li>\n" +
"<li>A member of one of its <a href=\"/wiki/List_of_specialized_agencies_of_the_United_Nations\" title=\"List of specialized agencies of the United Nations\">specialized agencies</a></li>\n" +
"<li>A party to the <i><a href=\"/wiki/Statute_of_the_International_Court_of_Justice\" title=\"Statute of the International Court of Justice\">Statute of the International Court of Justice</a></i></li>\n" +
"</ul>\n" +
"<p>The list of names in <i>Country and Region Codes for Statistical Use</i> of the UN Statistics Division is based on the bulletin <i>Country Names</i> and other UN sources.</p>\n" +
"<p>Once a country name or territory name appears in either of these two sources, it will be added to ISO 3166-1 by default.</p>\n" +
"<p>The ISO 3166/MA may <a href=\"#Reserved_and_user-assigned_code_elements\">reserve code elements</a> for other entities that do not qualify for inclusion based on the above criteria.<sup id=\"cite_ref-8\" class=\"reference\"><a href=\"#cite_note-8\"><span>[</span>8<span>]</span></a></sup> For example, because the <a href=\"/wiki/European_Union\" title=\"European Union\">European Union</a> is not a country, it is not formally included in ISO 3166-1, but for practical reasons, the ISO 3166/MA has \"reserved the two-letter combination <span style=\"font-family: monospace, monospace;\">EU</span> for the purpose of identifying the European Union within the framework of ISO 3166-1\".<sup id=\"cite_ref-faqs_specific_9-0\" class=\"reference\"><a href=\"#cite_note-faqs_specific-9\"><span>[</span>9<span>]</span></a></sup></p>\n" +
"<h2><span class=\"mw-headline\" id=\"Naming_and_code_construction\">Naming and code construction</span><span class=\"mw-editsection\"><span class=\"mw-editsection-bracket\">[</span><a href=\"/w/index.php?title=ISO_3166-1&amp;action=edit&amp;section=2\" title=\"Edit section: Naming and code construction\">edit</a><span class=\"mw-editsection-bracket\">]</span></span></h2>\n" +
"<div class=\"thumb tright\">\n" +
"<div class=\"thumbinner\" style=\"width:114px;\"><a href=\"/wiki/File:ISO_logo.png\" class=\"image\"><img alt=\"A blue rectangle with a white line drawing of a sphere inside divided longitudinally and latitudinally and emblazoned with the letters &quot;ISO&quot; in white\" src=\"//upload.wikimedia.org/wikipedia/commons/4/47/ISO_logo.png\" width=\"112\" height=\"103\" class=\"thumbimage\" data-file-width=\"112\" data-file-height=\"103\" /></a>\n" +
"<div class=\"thumbcaption\">\n" +
"<div class=\"magnify\"><a href=\"/wiki/File:ISO_logo.png\" class=\"internal\" title=\"Enlarge\"></a></div>\n" +
"The <a href=\"/wiki/International_Organization_for_Standardization\" title=\"International Organization for Standardization\">International Organization for Standardization</a> uses the country names chosen by the <a href=\"/wiki/United_Nations\" title=\"United Nations\">United Nations</a>, some of which are disputed.</div>\n" +
"</div>\n" +
"</div>\n" +
"<p>The country names used in ISO 3166-1 are taken from the two UN sources mentioned above. Some country names used by the UN, and accordingly by ISO, are subject to dispute:</p>\n" +
"<ul>\n" +
"<li>The <a href=\"/wiki/Republic_of_Macedonia\" title=\"Republic of Macedonia\">Republic of Macedonia</a> is listed as \"Macedonia, the former Yugoslav Republic of\" because of the <a href=\"/wiki/Macedonia_naming_dispute\" title=\"Macedonia naming dispute\">Macedonia naming dispute</a>, following the provisional reference used by the United Nations.</li>\n" +
"<li><a href=\"/wiki/Taiwan\" title=\"Taiwan\">Taiwan</a> is listed as non-independent \"<a href=\"/wiki/Taiwan,_Province_of_China\" title=\"Taiwan, Province of China\" class=\"mw-redirect\">Taiwan, Province of China</a>\" or \"Taiwan (Province of China)\" as the lower-case short name, with \"Taiwan\" as the local short name acknowledged,<sup id=\"cite_ref-10\" class=\"reference\"><a href=\"#cite_note-10\"><span>[</span>10<span>]</span></a></sup> because of its <a href=\"/wiki/Political_status_of_Taiwan\" title=\"Political status of Taiwan\">political status within the United Nations</a>.<sup id=\"cite_ref-faqs_specific_9-1\" class=\"reference\"><a href=\"#cite_note-faqs_specific-9\"><span>[</span>9<span>]</span></a></sup> In 2007, the <a href=\"/wiki/Republic_of_China\" title=\"Republic of China\" class=\"mw-redirect\">Republic of China</a> filed a lawsuit before a Swiss civil court against the ISO, arguing that the ISO's use of the UN name rather than \"Republic of China (Taiwan)\" violates Taiwan's name rights.<sup id=\"cite_ref-11\" class=\"reference\"><a href=\"#cite_note-11\"><span>[</span>11<span>]</span></a></sup> On 9 September 2010, a panel of the <a href=\"/wiki/Federal_Supreme_Court_of_Switzerland\" title=\"Federal Supreme Court of Switzerland\">Federal Supreme Court of Switzerland</a> decided, by three votes to two, to dismiss the suit as presenting a <a href=\"/wiki/Political_question\" title=\"Political question\">political question</a> not subject to Swiss civil jurisdiction.<sup id=\"cite_ref-12\" class=\"reference\"><a href=\"#cite_note-12\"><span>[</span>12<span>]</span></a></sup><sup id=\"cite_ref-13\" class=\"reference\"><a href=\"#cite_note-13\"><span>[</span>13<span>]</span></a></sup><sup id=\"cite_ref-14\" class=\"reference\"><a href=\"#cite_note-14\"><span>[</span>14<span>]</span></a></sup></li>\n" +
"<li>Following the <a href=\"/wiki/United_Nations_General_Assembly_resolution_67/19\" title=\"United Nations General Assembly resolution 67/19\">recognition of Palestine as a non-member UN state</a> in 2012, the official designation used in ISO 3166-1 was changed from \"<a href=\"/wiki/Palestinian_territories\" title=\"Palestinian territories\">Palestinian Territory, Occupied</a>\" to \"<a href=\"/wiki/State_of_Palestine\" title=\"State of Palestine\">Palestine, State of</a>\",<sup id=\"cite_ref-15\" class=\"reference\"><a href=\"#cite_note-15\"><span>[</span>15<span>]</span></a></sup> with a remark noting conventional names but still not considered an independent sovereign state in ISO 3166.<sup id=\"cite_ref-16\" class=\"reference\"><a href=\"#cite_note-16\"><span>[</span>16<span>]</span></a></sup></li>\n" +
"</ul>\n" +
"<p>The codes are chosen, according to the ISO 3166/MA, \"to reflect the significant, unique component of the country name in order to allow a visual association between country name and country code\".<sup id=\"cite_ref-faqs_specific_9-2\" class=\"reference\"><a href=\"#cite_note-faqs_specific-9\"><span>[</span>9<span>]</span></a></sup> For this reason, common components of country names like \"Republic\", \"Kingdom\", \"United\", \"Federal\" or \"Democratic\" are normally not used for deriving the code elements. As a consequence, for example, the <a href=\"/wiki/United_Kingdom\" title=\"United Kingdom\">United Kingdom</a> is officially assigned the alpha-2 code <span style=\"font-family: monospace, monospace;\">GB</span> rather than <span style=\"font-family: monospace, monospace;\">UK</span>, based on its official name \"United Kingdom of Great Britain and Northern Ireland\" (although <span style=\"font-family: monospace, monospace;\">UK</span> is <a href=\"#Reserved_and_user-assigned_code_elements\">reserved</a> on the request of the United Kingdom). Some codes are chosen based on the native names of the countries. For example, <a href=\"/wiki/Germany\" title=\"Germany\">Germany</a> is assigned the alpha-2 code <span style=\"font-family: monospace, monospace;\">DE</span>, based on its native name \"Deutschland\".</p>\n" +
"<h2><span class=\"mw-headline\" id=\"Information_included\">Information included</span><span class=\"mw-editsection\"><span class=\"mw-editsection-bracket\">[</span><a href=\"/w/index.php?title=ISO_3166-1&amp;action=edit&amp;section=3\" title=\"Edit section: Information included\">edit</a><span class=\"mw-editsection-bracket\">]</span></span></h2>\n" +
"<p>ISO 3166-1 is published officially in both <a href=\"/wiki/English_language\" title=\"English language\">English</a> and <a href=\"/wiki/French_language\" title=\"French language\">French</a>. Since the second edition of ISO 3166-1, the following columns are included for each entry:</p>\n" +
"<ol>\n" +
"<li>Country Name&#160;– English (or French) short name (all upper-case)</li>\n" +
"<li>English (or French) short name (upper/lower case)</li>\n" +
"<li>English (or French) full name</li>\n" +
"<li><a href=\"/wiki/ISO_3166-1_alpha-2\" title=\"ISO 3166-1 alpha-2\">Alpha-2 code</a></li>\n" +
"<li><a href=\"/wiki/ISO_3166-1_alpha-3\" title=\"ISO 3166-1 alpha-3\">Alpha-3 code</a></li>\n" +
"<li><a href=\"/wiki/ISO_3166-1_numeric\" title=\"ISO 3166-1 numeric\">Numeric code</a></li>\n" +
"<li>Remarks</li>\n" +
"<li>Independent (# denotes the country is considered a <a href=\"/wiki/Sovereign_state\" title=\"Sovereign state\">sovereign state</a>)</li>\n" +
"<li>Additional information: <a href=\"/wiki/Official_language\" title=\"Official language\">Administrative language(s)</a> <a href=\"/wiki/ISO_639-1\" title=\"ISO 639-1\">alpha-2 code element(s)</a></li>\n" +
"<li>Additional information: Administrative language(s) <a href=\"/wiki/ISO_639-2\" title=\"ISO 639-2\">alpha-3 code element(s)</a></li>\n" +
"<li>Additional information: <a href=\"/wiki/List_of_countries_by_native_names\" title=\"List of countries by native names\" class=\"mw-redirect\">Local short name(s)</a></li>\n" +
"</ol>\n" +
"<h2><span class=\"mw-headline\" id=\"Current_codes\">Current codes</span><span class=\"mw-editsection\"><span class=\"mw-editsection-bracket\">[</span><a href=\"/w/index.php?title=ISO_3166-1&amp;action=edit&amp;section=4\" title=\"Edit section: Current codes\">edit</a><span class=\"mw-editsection-bracket\">]</span></span></h2>\n" +
"<h3><span class=\"mw-headline\" id=\"Officially_assigned_code_elements\">Officially assigned code elements</span><span class=\"mw-editsection\"><span class=\"mw-editsection-bracket\">[</span><a href=\"/w/index.php?title=ISO_3166-1&amp;action=edit&amp;section=5\" title=\"Edit section: Officially assigned code elements\">edit</a><span class=\"mw-editsection-bracket\">]</span></span></h3>\n" +
"<p>The following is a complete ISO 3166-1 encoding list of the countries which are assigned official codes. It is listed in alphabetical order by the English short country name (upper/lower case) used by the ISO 3166/MA.<sup id=\"cite_ref-17\" class=\"reference\"><a href=\"#cite_note-17\"><span>[</span>17<span>]</span></a></sup></p>\n" +
"<p><i>Click on the button in the header to sort each column. For more information on each country and the assignment of its code elements, click on its <a href=\"/wiki/ISO_3166-1_alpha-2#Officially_assigned_code_elements\" title=\"ISO 3166-1 alpha-2\">alpha-2 code</a>.</i></p>\n" +
"<table class=\"wikitable sortable\">\n" +
"<tr>\n" +
"<th scope=\"col\">English short name (upper/lower case)</th>\n" +
"<th scope=\"col\"><a href=\"/wiki/ISO_3166-1_alpha-2#Officially_assigned_code_elements\" title=\"ISO 3166-1 alpha-2\">Alpha-2 code</a></th>\n" +
"<th scope=\"col\"><a href=\"/wiki/ISO_3166-1_alpha-3#Officially_assigned_code_elements\" title=\"ISO 3166-1 alpha-3\">Alpha-3 code</a></th>\n" +
"<th scope=\"col\"><a href=\"/wiki/ISO_3166-1_numeric#Officially_assigned_code_elements\" title=\"ISO 3166-1 numeric\">Numeric code</a></th>\n" +
"<th scope=\"col\"><a href=\"/wiki/ISO_3166-2\" title=\"ISO 3166-2\">ISO 3166-2</a> codes</th>\n" +
"</tr>\n" +
"<tr>\n" +
"<td><a href=\"/wiki/Afghanistan\" title=\"Afghanistan\">Afghanistan</a></td>\n" +
"<td><a href=\"/wiki/ISO_3166-1_alpha-2#AF\" title=\"ISO 3166-1 alpha-2\"><span style=\"font-family: monospace, monospace;\">AF</span></a></td>\n" +
"<td><span style=\"font-family: monospace, monospace;\">AFG</span></td>\n" +
"<td><span style=\"font-family: monospace, monospace;\">004</span></td>\n" +
"<td><a href=\"/wiki/ISO_3166-2:AF\" title=\"ISO 3166-2:AF\">ISO 3166-2:AF</a></td>\n" +
"</tr>\n" +
"<tr>\n" +
"<td><span style=\"display:none;\" class=\"sortkey\">Aland Islands !</span><span class=\"sorttext\"><a href=\"/wiki/%C3%85land_Islands\" title=\"Åland Islands\">Åland Islands</a></span></td>\n" +
"<td><a href=\"/wiki/ISO_3166-1_alpha-2#AX\" title=\"ISO 3166-1 alpha-2\"><span style=\"font-family: monospace, monospace;\">AX</span></a></td>\n" +
"<td><span style=\"font-family: monospace, monospace;\">ALA</span></td>\n" +
"<td><span style=\"font-family: monospace, monospace;\">248</span></td>\n" +
"<td><a href=\"/wiki/ISO_3166-2:AX\" title=\"ISO 3166-2:AX\">ISO 3166-2:AX</a></td>\n" +
"</tr>\n" +
"<tr>\n" +
"<td><a href=\"/wiki/Albania\" title=\"Albania\">Albania</a></td>\n" +
"<td><a href=\"/wiki/ISO_3166-1_alpha-2#AL\" title=\"ISO 3166-1 alpha-2\"><span style=\"font-family: monospace, monospace;\">AL</span></a></td>\n" +
"<td><span style=\"font-family: monospace, monospace;\">ALB</span></td>\n" +
"<td><span style=\"font-family: monospace, monospace;\">008</span></td>\n" +
"<td><a href=\"/wiki/ISO_3166-2:AL\" title=\"ISO 3166-2:AL\">ISO 3166-2:AL</a></td>\n" +
"</tr>\n" +
"<tr>\n" +
"<td><a href=\"/wiki/Algeria\" title=\"Algeria\">Algeria</a></td>\n" +
"<td><a href=\"/wiki/ISO_3166-1_alpha-2#DZ\" title=\"ISO 3166-1 alpha-2\"><span style=\"font-family: monospace, monospace;\">DZ</span></a></td>\n" +
"<td><span style=\"font-family: monospace, monospace;\">DZA</span></td>\n" +
"<td><span style=\"font-family: monospace, monospace;\">012</span></td>\n" +
"<td><a href=\"/wiki/ISO_3166-2:DZ\" title=\"ISO 3166-2:DZ\">ISO 3166-2:DZ</a></td>\n" +
"</tr>\n" +
"<tr>\n" +
"<td><a href=\"/wiki/American_Samoa\" title=\"American Samoa\">American Samoa</a></td>\n" +
"<td><a href=\"/wiki/ISO_3166-1_alpha-2#AS\" title=\"ISO 3166-1 alpha-2\"><span style=\"font-family: monospace, monospace;\">AS</span></a></td>\n" +
"<td><span style=\"font-family: monospace, monospace;\">ASM</span></td>\n" +
"<td><span style=\"font-family: monospace, monospace;\">016</span></td>\n" +
"<td><a href=\"/wiki/ISO_3166-2:AS\" title=\"ISO 3166-2:AS\">ISO 3166-2:AS</a></td>\n" +
"</tr>\n" +
"<tr>\n" +
"<td><a href=\"/wiki/Andorra\" title=\"Andorra\">Andorra</a></td>\n" +
"<td><a href=\"/wiki/ISO_3166-1_alpha-2#AD\" title=\"ISO 3166-1 alpha-2\"><span style=\"font-family: monospace, monospace;\">AD</span></a></td>\n" +
"<td><span style=\"font-family: monospace, monospace;\">AND</span></td>\n" +
"<td><span style=\"font-family: monospace, monospace;\">020</span></td>\n" +
"<td><a href=\"/wiki/ISO_3166-2:AD\" title=\"ISO 3166-2:AD\">ISO 3166-2:AD</a></td>\n" +
"</tr>\n" +
"<tr>\n" +
"<td><a href=\"/wiki/Angola\" title=\"Angola\">Angola</a></td>\n" +
"<td><a href=\"/wiki/ISO_3166-1_alpha-2#AO\" title=\"ISO 3166-1 alpha-2\"><span style=\"font-family: monospace, monospace;\">AO</span></a></td>\n" +
"<td><span style=\"font-family: monospace, monospace;\">AGO</span></td>\n" +
"<td><span style=\"font-family: monospace, monospace;\">024</span></td>\n" +
"<td><a href=\"/wiki/ISO_3166-2:AO\" title=\"ISO 3166-2:AO\">ISO 3166-2:AO</a></td>\n" +
"</tr>\n" +
"<tr>\n" +
"<td><a href=\"/wiki/Anguilla\" title=\"Anguilla\">Anguilla</a></td>\n" +
"<td><a href=\"/wiki/ISO_3166-1_alpha-2#AI\" title=\"ISO 3166-1 alpha-2\"><span style=\"font-family: monospace, monospace;\">AI</span></a></td>\n" +
"<td><span style=\"font-family: monospace, monospace;\">AIA</span></td>\n" +
"<td><span style=\"font-family: monospace, monospace;\">660</span></td>\n" +
"<td><a href=\"/wiki/ISO_3166-2:AI\" title=\"ISO 3166-2:AI\">ISO 3166-2:AI</a></td>\n" +
"</tr>\n" +
"<tr>\n" +
"<td><a href=\"/wiki/Antarctica\" title=\"Antarctica\">Antarctica</a></td>\n" +
"<td><a href=\"/wiki/ISO_3166-1_alpha-2#AQ\" title=\"ISO 3166-1 alpha-2\"><span style=\"font-family: monospace, monospace;\">AQ</span></a></td>\n" +
"<td><span style=\"font-family: monospace, monospace;\">ATA</span></td>\n" +
"<td><span style=\"font-family: monospace, monospace;\">010</span></td>\n" +
"<td><a href=\"/wiki/ISO_3166-2:AQ\" title=\"ISO 3166-2:AQ\">ISO 3166-2:AQ</a></td>\n" +
"</tr>\n" +
"<tr>\n" +
"<td><a href=\"/wiki/Antigua_and_Barbuda\" title=\"Antigua and Barbuda\">Antigua and Barbuda</a></td>\n" +
"<td><a href=\"/wiki/ISO_3166-1_alpha-2#AG\" title=\"ISO 3166-1 alpha-2\"><span style=\"font-family: monospace, monospace;\">AG</span></a></td>\n" +
"<td><span style=\"font-family: monospace, monospace;\">ATG</span></td>\n" +
"<td><span style=\"font-family: monospace, monospace;\">028</span></td>\n" +
"<td><a href=\"/wiki/ISO_3166-2:AG\" title=\"ISO 3166-2:AG\">ISO 3166-2:AG</a></td>\n" +
"</tr>\n" +
"<tr>\n" +
"<td><a href=\"/wiki/Argentina\" title=\"Argentina\">Argentina</a></td>\n" +
"<td><a href=\"/wiki/ISO_3166-1_alpha-2#AR\" title=\"ISO 3166-1 alpha-2\"><span style=\"font-family: monospace, monospace;\">AR</span></a></td>\n" +
"<td><span style=\"font-family: monospace, monospace;\">ARG</span></td>\n" +
"<td><span style=\"font-family: monospace, monospace;\">032</span></td>\n" +
"<td><a href=\"/wiki/ISO_3166-2:AR\" title=\"ISO 3166-2:AR\">ISO 3166-2:AR</a></td>\n" +
"</tr>\n" +
"<tr>\n" +
"<td><a href=\"/wiki/Armenia\" title=\"Armenia\">Armenia</a></td>\n" +
"<td><a href=\"/wiki/ISO_3166-1_alpha-2#AM\" title=\"ISO 3166-1 alpha-2\"><span style=\"font-family: monospace, monospace;\">AM</span></a></td>\n" +
"<td><span style=\"font-family: monospace, monospace;\">ARM</span></td>\n" +
"<td><span style=\"font-family: monospace, monospace;\">051</span></td>\n" +
"<td><a href=\"/wiki/ISO_3166-2:AM\" title=\"ISO 3166-2:AM\">ISO 3166-2:AM</a></td>\n" +
"</tr>";
    
    public static void main(String[] args) {
        Import app = new Import();
    }

    public Import() {
        List<String> words = Parse.parse(TESTING, "<td(.*?)</td>", 
                new String[] {"<td>", "</td>", "<a(.*?)\\\">", "</a>", "<span(.*?)>", "</span>"});
        for(String r: words) System.out.printf("]]] %s\n",r);
    }
    
    

}
