<?xml version="1.0" encoding="utf-8"?>
<!-- edited with XMLSpy v2007 sp1 (http://www.altova.com) by  () -->
<xsl:stylesheet version="1.1"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<xsl:variable name="componentPreviewPic"
			select="externalNode/@preview">
		</xsl:variable>
		<xsl:if test="string-length($componentPreviewPic)!=0">
			<div class="FONTSTYLE" align="left">
				<img src="{$componentPreviewPic}" usemap="#jobmap"
					alt="No image available" class="bordercolor" />
			</div>
			<br />
		</xsl:if>
		
		<b class="FONTSTYLE"><xsl:value-of select="/externalNode/@i18n.job.component.parameters" /></b>
					<br />
					<table class="cols" width="90%" border="1"
						cellpadding="0" cellspacing="0"
						style="border-collapse: collapse; padding-left:10mm;"
						bordercolor="#111111" frame="box" summary="">
						<tr>
							<th align="left" width="30%"
								class="TABLECOLUMNSTYLE">
								<xsl:value-of select="/externalNode/@i18n.job.properties" />
							</th>
							<th align="left" width="70%"
								class="TABLECOLUMNSTYLE">
								<xsl:value-of select="/externalNode/@i18n.job.values" />
							</th>
						</tr>
						<xsl:for-each select="/externalNode/parameters/column">
							<tr>
								<td class="FONTSTYLE" align="left">
									<xsl:variable name="propname"
										select="@name" />
									<xsl:value-of select="$propname" />
								</td>
								<td class="FONTSTYLE" align="left">
								 <pre>
									<xsl:value-of select="text()" disable-output-escaping="yes"/>
									</pre>
								</td>
							</tr>
						</xsl:for-each>
					</table>
					<br />
		
		
		<b class="FONTSTYLE">
			<xsl:value-of select="/externalNode/@i18n.rowgenerator.info.for" />
			<xsl:value-of select="/externalNode/@name" />
			:
		</b>
		<table class="cols" width="90%" cellpadding="0" border="1" cellspacing="0"
			style="border-collapse: collapse" bordercolor="#111111" frame="box"
			summary="">
			<tr class="profont">
				<th class="TABLECOLUMNSTYLE"><xsl:value-of select="/externalNode/@i18n.job.column" /></th>
				<th class="TABLECOLUMNSTYLE"><xsl:value-of select="/externalNode/@i18n.job.key" /></th>
				<th class="TABLECOLUMNSTYLE"><xsl:value-of select="/externalNode/@i18n.job.type" /></th>
				<th class="TABLECOLUMNSTYLE"><xsl:value-of select="/externalNode/@i18n.job.nullable" /></th>
				<th class="TABLECOLUMNSTYLE"><xsl:value-of select="/externalNode/@i18n.job.length" /></th>
				<th class="TABLECOLUMNSTYLE"><xsl:value-of select="/externalNode/@i18n.job.precision" /></th>
				<th class="TABLECOLUMNSTYLE"><xsl:value-of select="/externalNode/@i18n.rowgenerator.default" /></th>
				<th class="TABLECOLUMNSTYLE"><xsl:value-of select="/externalNode/@i18n.job.comment" /></th>
				<th class="TABLECOLUMNSTYLE"><xsl:value-of select="/externalNode/@i18n.rowgenerator.functions" /></th>
				<th class="TABLECOLUMNSTYLE"><xsl:value-of select="/externalNode/@i18n.rowgenerator.parameters" /></th>
			</tr>
			<xsl:for-each select="/externalNode/column">
				<tr class="FONTSTYLE">
					<td align="left">
						<xsl:value-of select="@name" />
					</td>
					<td align="left">
						<xsl:value-of select="@key" />
					</td>
					<td align="left">
						<xsl:value-of select="@type" />
					</td>
					<td align="left">
						<xsl:value-of select="@nullable" />
					</td>
					<td align="left">
						<xsl:value-of select="@length" />
					</td>
					<td align="left">
						<xsl:value-of select="@precision" />
					</td>
					<td align="left">
						<xsl:value-of select="@default" />
					</td>
					<td align="left">
						<xsl:value-of select="@comment" />
					</td>
					<td align="left">
						<xsl:value-of select="@functions" />
					</td>
					<td align="left">
						<xsl:value-of select="@parameters" />
					</td>
				</tr>
			</xsl:for-each>
		</table>
		<br />
	</xsl:template>
</xsl:stylesheet>